package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sandals: ImageVector
    get() {
        if (_sandals != null) {
            return _sandals!!
        }
        _sandals = ImageVector.Builder(
            name = "Sandals",
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
        moveTo(10.5f, 18.3002f)
        verticalLineTo(5.81444f)
        curveTo(10.5f, 4.22713f, 10.0436f, 2.92085f, 8.11708f, 3.00374f)
        curveTo(6.50864f, 3.07294f, 5.00141f, 3.89684f, 3.80452f, 4.89375f)
        curveTo(1.66292f, 6.67753f, 1.72577f, 8.75973f, 2.46872f, 11.2023f)
        lineTo(4.85288f, 19.0408f)
        curveTo(5.20558f, 20.2004f, 6.33546f, 21f, 7.62123f, 21f)
        curveTo(9.21113f, 21f, 10.5f, 19.7913f, 10.5f, 18.3002f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 18.3002f)
        verticalLineTo(5.81444f)
        curveTo(13.5f, 4.22713f, 13.9564f, 2.92085f, 15.8829f, 3.00374f)
        curveTo(17.4914f, 3.07294f, 18.9986f, 3.89684f, 20.1955f, 4.89375f)
        curveTo(22.3371f, 6.67753f, 22.2742f, 8.75973f, 21.5313f, 11.2023f)
        lineTo(19.1471f, 19.0408f)
        curveTo(18.7944f, 20.2004f, 17.6645f, 21f, 16.3788f, 21f)
        curveTo(14.7889f, 21f, 13.5f, 19.7913f, 13.5f, 18.3002f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 13f)
        curveTo(3f, 12f, 3.7f, 9.3f, 6.5f, 8.5f)
        moveTo(6.5f, 8.5f)
        curveTo(9f, 9f, 10f, 10f, 10.5f, 10.5f)
        moveTo(6.5f, 8.5f)
        verticalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 13f)
        curveTo(21f, 12f, 20.3f, 9.3f, 17.5f, 8.5f)
        moveTo(17.5f, 8.5f)
        curveTo(15f, 9f, 14f, 10f, 13.5f, 10.5f)
        moveTo(17.5f, 8.5f)
        verticalLineTo(7f)
        }
        }.build()

        return _sandals!!
    }

private var _sandals: ImageVector? = null
