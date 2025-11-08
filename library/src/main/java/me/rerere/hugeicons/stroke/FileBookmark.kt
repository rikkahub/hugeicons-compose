package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FileBookmark: ImageVector
    get() {
        if (_fileBookmark != null) {
            return _fileBookmark!!
        }
        _fileBookmark = ImageVector.Builder(
            name = "FileBookmark",
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
        moveTo(4f, 13.0004f)
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
        moveTo(4f, 8.4532f)
        verticalLineTo(4.98748f)
        curveTo(4f, 3.57894f, 4f, 2.87467f, 4.43934f, 2.43709f)
        curveTo(4.87868f, 1.99951f, 5.58579f, 1.99951f, 7f, 1.99951f)
        curveTo(8.41421f, 1.99951f, 9.12132f, 1.99951f, 9.56066f, 2.43709f)
        curveTo(10f, 2.87467f, 10f, 3.57894f, 10f, 4.98748f)
        verticalLineTo(8.4532f)
        curveTo(10f, 9.37314f, 10f, 9.83311f, 9.71208f, 9.96742f)
        curveTo(9.42416f, 10.1017f, 9.06938f, 9.80727f, 8.35982f, 9.21834f)
        lineTo(7.64018f, 8.62106f)
        curveTo(7.33408f, 8.36699f, 7.18103f, 8.23996f, 7f, 8.23996f)
        curveTo(6.81897f, 8.23996f, 6.66592f, 8.36699f, 6.35982f, 8.62106f)
        lineTo(5.64018f, 9.21834f)
        curveTo(4.93062f, 9.80727f, 4.57584f, 10.1017f, 4.28792f, 9.96742f)
        curveTo(4f, 9.83311f, 4f, 9.37314f, 4f, 8.4532f)
        }
        }.build()

        return _fileBookmark!!
    }

private var _fileBookmark: ImageVector? = null
