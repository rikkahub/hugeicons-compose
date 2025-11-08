package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Maping: ImageVector
    get() {
        if (_maping != null) {
            return _maping!!
        }
        _maping = ImageVector.Builder(
            name = "Maping",
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
        moveTo(5.25345f, 4.19584f)
        lineTo(4.02558f, 4.90813f)
        curveTo(3.03739f, 5.48137f, 2.54329f, 5.768f, 2.27164f, 6.24483f)
        curveTo(2f, 6.72165f, 2f, 7.30233f, 2f, 8.46368f)
        verticalLineTo(16.6283f)
        curveTo(2f, 18.1542f, 2f, 18.9172f, 2.34226f, 19.3418f)
        curveTo(2.57001f, 19.6244f, 2.88916f, 19.8143f, 3.242f, 19.8773f)
        curveTo(3.77226f, 19.9719f, 4.42148f, 19.5953f, 5.71987f, 18.8421f)
        curveTo(6.60156f, 18.3306f, 7.45011f, 17.7994f, 8.50487f, 17.9435f)
        curveTo(8.98466f, 18.009f, 9.44231f, 18.2366f, 10.3576f, 18.6917f)
        lineTo(14.1715f, 20.588f)
        curveTo(14.9964f, 20.9982f, 15.004f, 21f, 15.9214f, 21f)
        horizontalLineTo(18f)
        curveTo(19.8856f, 21f, 20.8284f, 21f, 21.4142f, 20.4013f)
        curveTo(22f, 19.8026f, 22f, 18.8389f, 22f, 16.9117f)
        verticalLineTo(10.1715f)
        curveTo(22f, 8.24423f, 22f, 7.2806f, 21.4142f, 6.68188f)
        curveTo(20.8284f, 6.08316f, 19.8856f, 6.08316f, 18f, 6.08316f)
        horizontalLineTo(15.9214f)
        curveTo(15.004f, 6.08316f, 14.9964f, 6.08139f, 14.1715f, 5.6712f)
        lineTo(10.8399f, 4.01463f)
        curveTo(9.44884f, 3.32297f, 8.75332f, 2.97714f, 8.01238f, 3.00117f)
        curveTo(7.27143f, 3.02521f, 6.59877f, 3.41542f, 5.25345f, 4.19584f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 6.5f)
        verticalLineTo(20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 3.5f)
        verticalLineTo(17.5f)
        }
        }.build()

        return _maping!!
    }

private var _maping: ImageVector? = null
