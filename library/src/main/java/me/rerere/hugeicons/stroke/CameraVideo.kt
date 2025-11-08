package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CameraVideo: ImageVector
    get() {
        if (_cameraVideo != null) {
            return _cameraVideo!!
        }
        _cameraVideo = ImageVector.Builder(
            name = "CameraVideo",
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
        moveTo(4.5f, 21.5f)
        lineTo(8.5f, 17.5f)
        moveTo(10.5f, 17.5f)
        lineTo(14.5f, 21.5f)
        moveTo(9.5f, 17.5f)
        lineTo(9.5f, 22.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 11.875f)
        curveTo(2f, 9.81261f, 2f, 8.78141f, 3.02513f, 8.1407f)
        curveTo(4.05025f, 7.5f, 5.70017f, 7.5f, 9f, 7.5f)
        horizontalLineTo(10f)
        curveTo(13.2998f, 7.5f, 14.9497f, 7.5f, 15.9749f, 8.1407f)
        curveTo(17f, 8.78141f, 17f, 9.81261f, 17f, 11.875f)
        verticalLineTo(13.125f)
        curveTo(17f, 15.1874f, 17f, 16.2186f, 15.9749f, 16.8593f)
        curveTo(14.9497f, 17.5f, 13.2998f, 17.5f, 10f, 17.5f)
        horizontalLineTo(9f)
        curveTo(5.70017f, 17.5f, 4.05025f, 17.5f, 3.02513f, 16.8593f)
        curveTo(2f, 16.2186f, 2f, 15.1874f, 2f, 13.125f)
        verticalLineTo(11.875f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 10.2495f)
        lineTo(17.1259f, 10.174f)
        curveTo(19.2417f, 8.90435f, 20.2996f, 8.26954f, 21.1498f, 8.57605f)
        curveTo(22f, 8.88257f, 22f, 9.89876f, 22f, 11.9312f)
        verticalLineTo(13.0685f)
        curveTo(22f, 15.1009f, 22f, 16.1171f, 21.1498f, 16.4236f)
        curveTo(20.2996f, 16.7301f, 19.2417f, 16.0953f, 17.1259f, 14.8257f)
        lineTo(17f, 14.7501f)
        }
        }.build()

        return _cameraVideo!!
    }

private var _cameraVideo: ImageVector? = null
