package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Translation: ImageVector
    get() {
        if (_translation != null) {
            return _translation!!
        }
        _translation = ImageVector.Builder(
            name = "Translation",
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
        moveTo(5f, 5.96552f)
        horizontalLineTo(8.15f)
        moveTo(12f, 5.96552f)
        horizontalLineTo(10.25f)
        moveTo(8.15f, 5.96552f)
        horizontalLineTo(10.25f)
        moveTo(8.15f, 5.96552f)
        verticalLineTo(5f)
        moveTo(10.25f, 5.96552f)
        curveTo(9.88076f, 7.28593f, 9.10754f, 8.53411f, 8.225f, 9.63103f)
        moveTo(5.975f, 12f)
        curveTo(6.68843f, 11.344f, 7.4942f, 10.5394f, 8.225f, 9.63103f)
        moveTo(8.225f, 9.63103f)
        curveTo(7.775f, 9.10345f, 7.145f, 8.24984f, 6.965f, 7.86364f)
        moveTo(8.225f, 9.63103f)
        lineTo(9.575f, 11.0345f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.02231f, 16.9777f)
        curveTo(7.07674f, 18.6978f, 7.26397f, 19.7529f, 7.90796f, 20.5376f)
        curveTo(8.07418f, 20.7401f, 8.25989f, 20.9258f, 8.46243f, 21.092f)
        curveTo(9.56878f, 22f, 11.2125f, 22f, 14.5f, 22f)
        curveTo(17.7875f, 22f, 19.4312f, 22f, 20.5376f, 21.092f)
        curveTo(20.7401f, 20.9258f, 20.9258f, 20.7401f, 21.092f, 20.5376f)
        curveTo(22f, 19.4312f, 22f, 17.7875f, 22f, 14.5f)
        curveTo(22f, 11.2125f, 22f, 9.56878f, 21.092f, 8.46243f)
        curveTo(20.9258f, 8.25989f, 20.7401f, 8.07418f, 20.5376f, 7.90796f)
        curveTo(19.7563f, 7.26676f, 18.707f, 7.07837f, 17f, 7.02303f)
        moveTo(7.02231f, 16.9777f)
        curveTo(5.30217f, 16.9233f, 4.24713f, 16.736f, 3.46243f, 16.092f)
        curveTo(3.25989f, 15.9258f, 3.07418f, 15.7401f, 2.90796f, 15.5376f)
        curveTo(2f, 14.4312f, 2f, 12.7875f, 2f, 9.5f)
        curveTo(2f, 6.21252f, 2f, 4.56878f, 2.90796f, 3.46243f)
        curveTo(3.07418f, 3.25989f, 3.25989f, 3.07418f, 3.46243f, 2.90796f)
        curveTo(4.56878f, 2f, 6.21252f, 2f, 9.5f, 2f)
        curveTo(12.7875f, 2f, 14.4312f, 2f, 15.5376f, 2.90796f)
        curveTo(15.7401f, 3.07418f, 15.9258f, 3.25989f, 16.092f, 3.46243f)
        curveTo(16.736f, 4.24713f, 16.9233f, 5.30217f, 16.9777f, 7.02231f)
        curveTo(16.9777f, 7.02231f, 16.9777f, 7.02231f, 17f, 7.02303f)
        moveTo(7.02231f, 16.9777f)
        lineTo(17f, 7.02303f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 19f)
        lineTo(13.8333f, 17f)
        moveTo(18f, 19f)
        lineTo(17.1667f, 17f)
        moveTo(13.8333f, 17f)
        lineTo(15.5f, 13f)
        lineTo(17.1667f, 17f)
        moveTo(13.8333f, 17f)
        horizontalLineTo(17.1667f)
        }
        }.build()

        return _translation!!
    }

private var _translation: ImageVector? = null
