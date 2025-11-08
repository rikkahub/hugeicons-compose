package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Projector: ImageVector
    get() {
        if (_projector != null) {
            return _projector!!
        }
        _projector = ImageVector.Builder(
            name = "Projector",
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
        moveTo(19f, 12f)
        curveTo(19f, 14.2091f, 17.2091f, 16f, 15f, 16f)
        curveTo(12.7909f, 16f, 11f, 14.2091f, 11f, 12f)
        curveTo(11f, 9.79086f, 12.7909f, 8f, 15f, 8f)
        curveTo(17.2091f, 8f, 19f, 9.79086f, 19f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 12f)
        horizontalLineTo(19f)
        moveTo(11f, 12f)
        horizontalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 16f)
        horizontalLineTo(6.00808f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 4f)
        horizontalLineTo(10f)
        curveTo(6.22876f, 4f, 4.34315f, 4f, 3.17157f, 5.17157f)
        curveTo(2f, 6.34315f, 2f, 8.22876f, 2f, 12f)
        curveTo(2f, 15.7712f, 2f, 17.6569f, 3.17157f, 18.8284f)
        curveTo(4.34315f, 20f, 6.22876f, 20f, 10f, 20f)
        lineTo(14f, 20f)
        curveTo(17.7712f, 20f, 19.6569f, 20f, 20.8284f, 18.8284f)
        curveTo(22f, 17.6569f, 22f, 15.7712f, 22f, 12f)
        curveTo(22f, 8.22876f, 22f, 6.34315f, 20.8284f, 5.17157f)
        curveTo(19.6569f, 4f, 17.7712f, 4f, 14f, 4f)
        }
        }.build()

        return _projector!!
    }

private var _projector: ImageVector? = null
