package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PictureInPictureOn: ImageVector
    get() {
        if (_pictureInPictureOn != null) {
            return _pictureInPictureOn!!
        }
        _pictureInPictureOn = ImageVector.Builder(
            name = "PictureInPictureOn",
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
        moveTo(11.5f, 20f)
        horizontalLineTo(10f)
        curveTo(6.22876f, 20f, 4.34315f, 20f, 3.17157f, 18.8284f)
        curveTo(2f, 17.6569f, 2f, 15.7712f, 2f, 12f)
        curveTo(2f, 8.22876f, 2f, 6.34315f, 3.17157f, 5.17157f)
        curveTo(4.34315f, 4f, 6.22876f, 4f, 10f, 4f)
        horizontalLineTo(14f)
        curveTo(17.7712f, 4f, 19.6569f, 4f, 20.8284f, 5.17157f)
        curveTo(21.947f, 6.29018f, 21.9976f, 8.05974f, 21.9999f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 14f)
        horizontalLineTo(15.5f)
        curveTo(14.6716f, 14f, 14f, 14.6716f, 14f, 15.5f)
        verticalLineTo(18.5f)
        curveTo(14f, 19.3284f, 14.6716f, 20f, 15.5f, 20f)
        horizontalLineTo(20.5f)
        curveTo(21.3284f, 20f, 22f, 19.3284f, 22f, 18.5f)
        verticalLineTo(15.5f)
        curveTo(22f, 14.6716f, 21.3284f, 14f, 20.5f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 9.5f)
        verticalLineTo(12f)
        curveTo(11.0475f, 12.5744f, 10.6034f, 13.0238f, 10f, 13f)
        horizontalLineTo(7.5f)
        moveTo(6f, 8f)
        lineTo(10f, 12f)
        }
        }.build()

        return _pictureInPictureOn!!
    }

private var _pictureInPictureOn: ImageVector? = null
