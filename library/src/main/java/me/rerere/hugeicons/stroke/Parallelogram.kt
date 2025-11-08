package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Parallelogram: ImageVector
    get() {
        if (_parallelogram != null) {
            return _parallelogram!!
        }
        _parallelogram = ImageVector.Builder(
            name = "Parallelogram",
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
        moveTo(4.09102f, 8.54478f)
        curveTo(4.69578f, 6.36211f, 4.99816f, 5.27077f, 5.90007f, 4.63538f)
        curveTo(6.80198f, 4f, 8.04873f, 4f, 10.5422f, 4f)
        horizontalLineTo(14.5661f)
        curveTo(18.4865f, 4f, 20.4468f, 4f, 21.4452f, 5.15376f)
        curveTo(22.4435f, 6.30753f, 21.9681f, 8.02342f, 21.0173f, 11.4552f)
        lineTo(19.909f, 15.4552f)
        curveTo(19.3042f, 17.6379f, 19.0018f, 18.7292f, 18.0999f, 19.3646f)
        curveTo(17.198f, 20f, 15.9513f, 20f, 13.4578f, 20f)
        horizontalLineTo(9.43393f)
        curveTo(5.51345f, 20f, 3.55321f, 20f, 2.55483f, 18.8462f)
        curveTo(1.55645f, 17.6925f, 2.03188f, 15.9766f, 2.98273f, 12.5448f)
        lineTo(4.09102f, 8.54478f)
        }
        }.build()

        return _parallelogram!!
    }

private var _parallelogram: ImageVector? = null
