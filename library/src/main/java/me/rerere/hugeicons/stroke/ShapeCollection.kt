package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShapeCollection: ImageVector
    get() {
        if (_shapeCollection != null) {
            return _shapeCollection!!
        }
        _shapeCollection = ImageVector.Builder(
            name = "ShapeCollection",
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
        moveTo(3.88886f, 9.66294f)
        curveTo(4.39331f, 10f, 5.09554f, 10f, 6.5f, 10f)
        curveTo(7.90446f, 10f, 8.60669f, 10f, 9.11114f, 9.66294f)
        curveTo(9.32952f, 9.51702f, 9.51702f, 9.32952f, 9.66294f, 9.11114f)
        curveTo(10f, 8.60669f, 10f, 7.90446f, 10f, 6.5f)
        curveTo(10f, 5.09554f, 10f, 4.39331f, 9.66294f, 3.88886f)
        curveTo(9.51702f, 3.67048f, 9.32952f, 3.48298f, 9.11114f, 3.33706f)
        curveTo(8.60669f, 3f, 7.90446f, 3f, 6.5f, 3f)
        curveTo(5.09554f, 3f, 4.39331f, 3f, 3.88886f, 3.33706f)
        curveTo(3.67048f, 3.48298f, 3.48298f, 3.67048f, 3.33706f, 3.88886f)
        curveTo(3f, 4.39331f, 3f, 5.09554f, 3f, 6.5f)
        curveTo(3f, 7.90446f, 3f, 8.60669f, 3.33706f, 9.11114f)
        curveTo(3.48298f, 9.32952f, 3.67048f, 9.51702f, 3.88886f, 9.66294f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.809f, 10f)
        horizontalLineTo(20.191f)
        curveTo(20.6378f, 10f, 21f, 9.63779f, 21f, 9.19098f)
        curveTo(21f, 9.06539f, 20.9708f, 8.94152f, 20.9146f, 8.82918f)
        lineTo(18.2236f, 3.44721f)
        curveTo(18.0866f, 3.17313f, 17.8064f, 3f, 17.5f, 3f)
        curveTo(17.1936f, 3f, 16.9134f, 3.17313f, 16.7764f, 3.44721f)
        lineTo(14.0854f, 8.82918f)
        curveTo(14.0292f, 8.94152f, 14f, 9.06539f, 14f, 9.19098f)
        curveTo(14f, 9.63779f, 14.3622f, 10f, 14.809f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 15f)
        verticalLineTo(17.5f)
        curveTo(20.5f, 18.9142f, 20.5f, 19.6213f, 20.0607f, 20.0607f)
        curveTo(19.6213f, 20.5f, 18.9142f, 20.5f, 17.5f, 20.5f)
        horizontalLineTo(15f)
        moveTo(14.5f, 14.5f)
        lineTo(19.5f, 19.5f)
        }
        }.build()

        return _shapeCollection!!
    }

private var _shapeCollection: ImageVector? = null
