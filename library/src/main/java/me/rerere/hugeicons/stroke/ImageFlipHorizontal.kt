package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ImageFlipHorizontal: ImageVector
    get() {
        if (_imageFlipHorizontal != null) {
            return _imageFlipHorizontal!!
        }
        _imageFlipHorizontal = ImageVector.Builder(
            name = "ImageFlipHorizontal",
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
        moveTo(5.40887f, 10.5448f)
        lineTo(3.33488f, 14.4677f)
        curveTo(2.27012f, 16.4816f, 1.73775f, 17.4886f, 2.13166f, 18.2453f)
        curveTo(2.52557f, 19.002f, 3.58215f, 19.002f, 5.6953f, 19.002f)
        horizontalLineTo(7.76929f)
        curveTo(9.05748f, 19.002f, 9.70157f, 19.002f, 10.1018f, 18.5604f)
        curveTo(10.502f, 18.1189f, 10.502f, 17.4082f, 10.502f, 15.9869f)
        verticalLineTo(12.064f)
        curveTo(10.502f, 7.57709f, 10.502f, 5.33363f, 9.49221f, 5.03243f)
        curveTo(8.48246f, 4.73124f, 7.45793f, 6.66909f, 5.40887f, 10.5448f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5931f, 10.5448f)
        lineTo(20.6671f, 14.4677f)
        curveTo(21.7318f, 16.4816f, 22.2642f, 17.4886f, 21.8703f, 18.2453f)
        curveTo(21.4764f, 19.002f, 20.4198f, 19.002f, 18.3067f, 19.002f)
        lineTo(16.2327f, 19.002f)
        curveTo(14.9445f, 19.002f, 14.3004f, 19.002f, 13.9002f, 18.5604f)
        curveTo(13.5f, 18.1189f, 13.5f, 17.4082f, 13.5f, 15.9869f)
        lineTo(13.5f, 12.064f)
        curveTo(13.5f, 7.57709f, 13.5f, 5.33363f, 14.5097f, 5.03243f)
        curveTo(15.5195f, 4.73124f, 16.544f, 6.66909f, 18.5931f, 10.5448f)
        }
        }.build()

        return _imageFlipHorizontal!!
    }

private var _imageFlipHorizontal: ImageVector? = null
