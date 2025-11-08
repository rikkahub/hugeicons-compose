package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Leaf04: ImageVector
    get() {
        if (_leaf04 != null) {
            return _leaf04!!
        }
        _leaf04 = ImageVector.Builder(
            name = "Leaf04",
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
        moveTo(8.15658f, 15.8434f)
        curveTo(7.07994f, 15.8362f, 5.59735f, 15.5728f, 4.43407f, 14.4096f)
        curveTo(2.3623f, 12.3378f, 3.14497f, 9.25318f, 3.14497f, 9.25318f)
        curveTo(3.14497f, 9.25318f, 4.76016f, 8.84345f, 6.43811f, 9.40194f)
        curveTo(6.42585f, 9.31006f, 6.41557f, 9.217f, 6.4075f, 9.12271f)
        curveTo(6.39316f, 8.9551f, 6.38553f, 8.78381f, 6.38559f, 8.60857f)
        curveTo(6.38553f, 5.00308f, 9.59044f, 3f, 9.59044f, 3f)
        curveTo(9.59044f, 3f, 11.5931f, 4.25174f, 12.4323f, 6.55719f)
        curveTo(15.2245f, 4.60372f, 18.6141f, 5.38589f, 18.6141f, 5.38589f)
        curveTo(18.6141f, 5.38589f, 19.3963f, 8.77553f, 17.4428f, 11.5677f)
        curveTo(19.7483f, 12.4069f, 21f, 14.4096f, 21f, 14.4096f)
        curveTo(21f, 14.4096f, 18.9969f, 17.6145f, 15.3914f, 17.6144f)
        curveTo(15.1177f, 17.6144f, 14.8531f, 17.596f, 14.5981f, 17.5619f)
        curveTo(15.1565f, 19.2398f, 14.7468f, 20.855f, 14.7468f, 20.855f)
        curveTo(14.7468f, 20.855f, 11.6622f, 21.6377f, 9.59044f, 19.5659f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 21f)
        lineTo(13f, 11f)
        }
        }.build()

        return _leaf04!!
    }

private var _leaf04: ImageVector? = null
