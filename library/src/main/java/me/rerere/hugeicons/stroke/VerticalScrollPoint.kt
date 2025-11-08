package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.VerticalScrollPoint: ImageVector
    get() {
        if (_verticalScrollPoint != null) {
            return _verticalScrollPoint!!
        }
        _verticalScrollPoint = ImageVector.Builder(
            name = "VerticalScrollPoint",
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
        moveTo(14f, 12.0001f)
        curveTo(14f, 13.1046f, 13.1046f, 14.0001f, 12f, 14.0001f)
        curveTo(10.8954f, 14.0001f, 10f, 13.1046f, 10f, 12.0001f)
        curveTo(10f, 10.8955f, 10.8954f, 10.0001f, 12f, 10.0001f)
        curveTo(13.1046f, 10.0001f, 14f, 10.8955f, 14f, 12.0001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 6.99997f)
        curveTo(8f, 6.99997f, 10.946f, 3.00001f, 12f, 3f)
        curveTo(13.0541f, 2.99999f, 16f, 7f, 16f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 17f)
        curveTo(16f, 17f, 13.054f, 21f, 12f, 21f)
        curveTo(10.9459f, 21f, 8f, 17f, 8f, 17f)
        }
        }.build()

        return _verticalScrollPoint!!
    }

private var _verticalScrollPoint: ImageVector? = null
