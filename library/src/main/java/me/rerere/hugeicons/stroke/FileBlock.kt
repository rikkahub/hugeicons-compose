package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FileBlock: ImageVector
    get() {
        if (_fileBlock != null) {
            return _fileBlock!!
        }
        _fileBlock = ImageVector.Builder(
            name = "FileBlock",
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
        moveTo(4f, 11.0004f)
        lineTo(4f, 14.5446f)
        curveTo(4f, 17.7896f, 4f, 19.4121f, 4.88607f, 20.5111f)
        curveTo(5.06508f, 20.7331f, 5.26731f, 20.9354f, 5.48933f, 21.1144f)
        curveTo(6.58831f, 22.0004f, 8.21082f, 22.0004f, 11.4558f, 22.0004f)
        curveTo(12.1614f, 22.0004f, 12.5141f, 22.0004f, 12.8372f, 21.8864f)
        curveTo(12.9044f, 21.8627f, 12.9702f, 21.8354f, 13.0345f, 21.8047f)
        curveTo(13.3436f, 21.6569f, 13.593f, 21.4074f, 14.0919f, 20.9085f)
        lineTo(18.8284f, 16.172f)
        curveTo(19.4065f, 15.5939f, 19.6955f, 15.3049f, 19.8478f, 14.9374f)
        curveTo(20f, 14.5698f, 20f, 14.1611f, 20f, 13.3436f)
        verticalLineTo(10.0004f)
        curveTo(20f, 6.22919f, 20f, 4.34358f, 18.8284f, 3.172f)
        curveTo(17.7693f, 2.11284f, 16.1265f, 2.01122f, 13.0345f, 2.00146f)
        moveTo(13f, 21.5004f)
        verticalLineTo(21.0004f)
        curveTo(13f, 18.172f, 13f, 16.7578f, 13.8787f, 15.8791f)
        curveTo(14.7574f, 15.0004f, 16.1716f, 15.0004f, 19f, 15.0004f)
        horizontalLineTo(19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.97487f, 7.97438f)
        curveTo(10.6082f, 7.34101f, 11f, 6.46601f, 11f, 5.49951f)
        curveTo(11f, 3.56651f, 9.433f, 1.99951f, 7.5f, 1.99951f)
        curveTo(6.5335f, 1.99951f, 5.6585f, 2.39126f, 5.02513f, 3.02464f)
        moveTo(9.97487f, 7.97438f)
        curveTo(9.3415f, 8.60776f, 8.4665f, 8.99951f, 7.5f, 8.99951f)
        curveTo(5.567f, 8.99951f, 4f, 7.43251f, 4f, 5.49951f)
        curveTo(4f, 4.53301f, 4.39175f, 3.65801f, 5.02513f, 3.02464f)
        moveTo(9.97487f, 7.97438f)
        lineTo(5.02513f, 3.02464f)
        }
        }.build()

        return _fileBlock!!
    }

private var _fileBlock: ImageVector? = null
