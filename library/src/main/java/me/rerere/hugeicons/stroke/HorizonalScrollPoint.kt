package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HorizonalScrollPoint: ImageVector
    get() {
        if (_horizonalScrollPoint != null) {
            return _horizonalScrollPoint!!
        }
        _horizonalScrollPoint = ImageVector.Builder(
            name = "HorizonalScrollPoint",
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
        moveTo(14.0001f, 12f)
        curveTo(14.0001f, 13.1046f, 13.1046f, 14f, 12.0001f, 14f)
        curveTo(10.8955f, 14f, 10.0001f, 13.1046f, 10.0001f, 12f)
        curveTo(10.0001f, 10.8954f, 10.8955f, 10f, 12.0001f, 10f)
        curveTo(13.1046f, 10f, 14.0001f, 10.8954f, 14.0001f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.0001f, 8f)
        curveTo(18.0001f, 8f, 22.0001f, 10.946f, 22.0001f, 12f)
        curveTo(22.0001f, 13.0541f, 18.0001f, 16f, 18.0001f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.00003f, 16f)
        curveTo(6.00003f, 16f, 2.00007f, 13.054f, 2.00006f, 12f)
        curveTo(2.00005f, 10.9459f, 6.00006f, 8f, 6.00006f, 8f)
        }
        }.build()

        return _horizonalScrollPoint!!
    }

private var _horizonalScrollPoint: ImageVector? = null
