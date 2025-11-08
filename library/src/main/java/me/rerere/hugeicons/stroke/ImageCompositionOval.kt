package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ImageCompositionOval: ImageVector
    get() {
        if (_imageCompositionOval != null) {
            return _imageCompositionOval!!
        }
        _imageCompositionOval = ImageVector.Builder(
            name = "ImageCompositionOval",
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
        moveTo(18.0518f, 4.06314f)
        curveTo(14.0896f, 2.64561f, 9.91046f, 2.64563f, 5.94823f, 4.06315f)
        curveTo(4.28902f, 4.65674f, 3.45942f, 4.95354f, 2.72971f, 5.9896f)
        curveTo(2f, 7.02566f, 2f, 8.1524f, 2f, 10.4059f)
        verticalLineTo(13.5941f)
        curveTo(2f, 15.8476f, 2f, 16.9743f, 2.72971f, 18.0104f)
        curveTo(3.45942f, 19.0465f, 4.28902f, 19.3433f, 5.94823f, 19.9369f)
        curveTo(9.91046f, 21.3544f, 14.0896f, 21.3544f, 18.0518f, 19.9369f)
        curveTo(19.711f, 19.3433f, 20.5406f, 19.0465f, 21.2703f, 18.0104f)
        curveTo(22f, 16.9744f, 22f, 15.8476f, 22f, 13.5942f)
        verticalLineTo(10.4058f)
        curveTo(22f, 8.15236f, 22f, 7.02564f, 21.2703f, 5.98958f)
        curveTo(20.5406f, 4.95352f, 19.711f, 4.65673f, 18.0518f, 4.06314f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 15.5f)
        lineTo(7.46967f, 10.5303f)
        curveTo(7.80923f, 10.1908f, 8.26978f, 10f, 8.75f, 10f)
        curveTo(9.23022f, 10f, 9.69077f, 10.1908f, 10.0303f, 10.5303f)
        lineTo(14f, 14.5f)
        moveTo(15.5f, 16f)
        lineTo(14f, 14.5f)
        moveTo(21.5f, 15.5f)
        lineTo(18.5303f, 12.5303f)
        curveTo(18.1908f, 12.1908f, 17.7302f, 12f, 17.25f, 12f)
        curveTo(16.7698f, 12f, 16.3092f, 12.1908f, 15.9697f, 12.5303f)
        lineTo(14f, 14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 8f)
        curveTo(14.7761f, 8f, 15f, 7.77614f, 15f, 7.5f)
        curveTo(15f, 7.22386f, 14.7761f, 7f, 14.5f, 7f)
        moveTo(14.5f, 8f)
        curveTo(14.2239f, 8f, 14f, 7.77614f, 14f, 7.5f)
        curveTo(14f, 7.22386f, 14.2239f, 7f, 14.5f, 7f)
        moveTo(14.5f, 8f)
        verticalLineTo(7f)
        }
        }.build()

        return _imageCompositionOval!!
    }

private var _imageCompositionOval: ImageVector? = null
