package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Waze: ImageVector
    get() {
        if (_waze != null) {
            return _waze!!
        }
        _waze = ImageVector.Builder(
            name = "Waze",
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
        moveTo(17.5f, 9f)
        verticalLineTo(9.01f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 9f)
        verticalLineTo(9.01f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 13f)
        curveTo(10.5f, 13f, 11.5f, 15f, 14f, 15f)
        curveTo(16.5f, 15f, 17.5f, 13f, 17.5f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 20f)
        curveTo(11f, 21.1046f, 10.1046f, 22f, 9f, 22f)
        curveTo(7.89543f, 22f, 7f, 21.1046f, 7f, 20f)
        curveTo(7f, 18.8954f, 7.89543f, 18f, 9f, 18f)
        curveTo(10.1046f, 18f, 11f, 18.8954f, 11f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.9992f, 19.9446f)
        curveTo(11.6843f, 19.9866f, 12.3573f, 20f, 13f, 20f)
        curveTo(17.9706f, 20f, 22f, 15.9706f, 22f, 11f)
        curveTo(22f, 6.02944f, 17.9706f, 2f, 13f, 2f)
        curveTo(8.02944f, 2f, 4f, 6.02944f, 4f, 11f)
        curveTo(4f, 12.039f, 4f, 14f, 2f, 15f)
        curveTo(3.05768f, 17.3798f, 4.97354f, 18.6409f, 7.12557f, 19.3009f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 22.0003f)
        curveTo(18.1046f, 22.0003f, 19f, 21.1049f, 19f, 20.0003f)
        curveTo(19f, 19.3295f, 18.6698f, 18.7359f, 18.163f, 18.373f)
        curveTo(17.2278f, 19.0291f, 16.1621f, 19.5118f, 15.0126f, 19.7744f)
        curveTo(15.0043f, 19.8486f, 15f, 19.9239f, 15f, 20.0003f)
        curveTo(15f, 21.1049f, 15.8954f, 22.0003f, 17f, 22.0003f)
        }
        }.build()

        return _waze!!
    }

private var _waze: ImageVector? = null
