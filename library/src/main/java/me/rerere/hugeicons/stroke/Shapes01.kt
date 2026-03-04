package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Shapes01: ImageVector
    get() {
        if (_shapes01 != null) {
            return _shapes01!!
        }
        _shapes01 = ImageVector.Builder(
            name = "Shapes01",
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
        moveTo(13.3382f, 10f)
        horizontalLineTo(10.6618f)
        curveTo(9.1273f, 10f, 8.36006f, 10f, 8.08543f, 9.49297f)
        curveTo(7.8108f, 8.98594f, 8.21743f, 8.32019f, 9.0307f, 6.9887f)
        lineTo(10.3689f, 4.79773f)
        curveTo(11.101f, 3.59924f, 11.467f, 3f, 12f, 3f)
        curveTo(12.533f, 3f, 12.899f, 3.59924f, 13.6311f, 4.79773f)
        lineTo(14.9693f, 6.9887f)
        curveTo(15.7826f, 8.32019f, 16.1892f, 8.98594f, 15.9146f, 9.49297f)
        curveTo(15.6399f, 10f, 14.8727f, 10f, 13.3382f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.66294f, 20.1111f)
        curveTo(10f, 19.6067f, 10f, 18.9045f, 10f, 17.5f)
        curveTo(10f, 16.0955f, 10f, 15.3933f, 9.66294f, 14.8889f)
        curveTo(9.51702f, 14.6705f, 9.32952f, 14.483f, 9.11114f, 14.3371f)
        curveTo(8.60669f, 14f, 7.90446f, 14f, 6.5f, 14f)
        curveTo(5.09554f, 14f, 4.39331f, 14f, 3.88886f, 14.3371f)
        curveTo(3.67048f, 14.483f, 3.48298f, 14.6705f, 3.33706f, 14.8889f)
        curveTo(3f, 15.3933f, 3f, 16.0955f, 3f, 17.5f)
        curveTo(3f, 18.9045f, 3f, 19.6067f, 3.33706f, 20.1111f)
        curveTo(3.48298f, 20.3295f, 3.67048f, 20.517f, 3.88886f, 20.6629f)
        curveTo(4.39331f, 21f, 5.09554f, 21f, 6.5f, 21f)
        curveTo(7.90446f, 21f, 8.60669f, 21f, 9.11114f, 20.6629f)
        curveTo(9.32952f, 20.517f, 9.51702f, 20.3295f, 9.66294f, 20.1111f)
        }
        }.build()

        return _shapes01!!
    }

private var _shapes01: ImageVector? = null
