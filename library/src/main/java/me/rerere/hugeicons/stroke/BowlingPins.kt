package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BowlingPins: ImageVector
    get() {
        if (_bowlingPins != null) {
            return _bowlingPins!!
        }
        _bowlingPins = ImageVector.Builder(
            name = "BowlingPins",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 10.544f)
        curveTo(13.2611f, 10.1947f, 14.1078f, 10f, 15f, 10f)
        curveTo(18.3137f, 10f, 21f, 12.6863f, 21f, 16f)
        curveTo(21f, 19.3137f, 18.3137f, 22f, 15f, 22f)
        curveTo(14.4821f, 22f, 13.9794f, 21.9344f, 13.5f, 21.811f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.991f, 15f)
        horizontalLineTo(18f)
        moveTo(15f, 15f)
        horizontalLineTo(15.009f)
        moveTo(16.4955f, 13f)
        lineTo(16.5045f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.88423f, 6.56062f)
        lineTo(5.45498f, 4.45142f)
        curveTo(5.19688f, 3.18322f, 6.18394f, 2f, 7.5f, 2f)
        curveTo(8.81606f, 2f, 9.80312f, 3.18322f, 9.54502f, 4.45142f)
        lineTo(9.11577f, 6.56062f)
        curveTo(8.47015f, 9.73293f, 10.2277f, 11.6357f, 11.4499f, 14.2704f)
        curveTo(11.9824f, 15.4182f, 12.1332f, 16.7017f, 11.8809f, 17.9385f)
        curveTo(11.6648f, 18.998f, 11.3245f, 20.6686f, 10.6053f, 21.4829f)
        curveTo(10.1239f, 22.0281f, 9.44033f, 21.9997f, 8.76023f, 21.9997f)
        horizontalLineTo(6.23977f)
        curveTo(5.55967f, 21.9997f, 4.87609f, 22.0281f, 4.39466f, 21.4829f)
        curveTo(3.67546f, 20.6686f, 3.33521f, 18.998f, 3.11909f, 17.9385f)
        curveTo(2.86681f, 16.7017f, 3.01761f, 15.4182f, 3.55006f, 14.2704f)
        curveTo(4.77234f, 11.6357f, 6.52985f, 9.73293f, 5.88423f, 6.56062f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 9f)
        horizontalLineTo(9f)
        }
        }.build()

        return _bowlingPins!!
    }

private var _bowlingPins: ImageVector? = null
