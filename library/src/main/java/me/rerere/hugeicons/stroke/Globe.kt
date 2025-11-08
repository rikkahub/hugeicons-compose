package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Globe: ImageVector
    get() {
        if (_globe != null) {
            return _globe!!
        }
        _globe = ImageVector.Builder(
            name = "Globe",
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
        moveTo(12.5f, 19f)
        lineTo(12.5f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 22f)
        horizontalLineTo(14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 4f)
        curveTo(9.15431f, 4.0385f, 9.49236f, 4.35899f, 10.0735f, 4.97301f)
        curveTo(11.1231f, 6.08206f, 12.1727f, 6.1746f, 12.8724f, 5.80492f)
        curveTo(13.922f, 5.2504f, 13.04f, 4.35221f, 14.2719f, 3.86409f)
        curveTo(15.0748f, 3.54595f, 15.1868f, 2.68026f, 14.7399f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 10f)
        curveTo(18.5f, 10f, 18.2338f, 11.2468f, 17f, 11f)
        curveTo(14.5f, 10.5f, 13.7916f, 11.0589f, 13.7916f, 12.2511f)
        curveTo(13.7916f, 13.4432f, 13.7916f, 13.4432f, 13.2717f, 14.3373f)
        curveTo(12.9335f, 14.9189f, 12.8153f, 15.5004f, 13.4894f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 2f)
        curveTo(4.64864f, 3.79995f, 3.5f, 6.3082f, 3.5f, 9.08251f)
        curveTo(3.5f, 14.5598f, 7.97715f, 19f, 13.5f, 19f)
        curveTo(16.2255f, 19f, 18.6962f, 17.9187f, 20.5f, 16.165f)
        }
        }.build()

        return _globe!!
    }

private var _globe: ImageVector? = null
