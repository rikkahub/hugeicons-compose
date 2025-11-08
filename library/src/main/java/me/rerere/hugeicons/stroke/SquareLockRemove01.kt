package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareLockRemove01: ImageVector
    get() {
        if (_squareLockRemove01 != null) {
            return _squareLockRemove01!!
        }
        _squareLockRemove01 = ImageVector.Builder(
            name = "SquareLockRemove01",
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
        moveTo(14f, 22f)
        lineTo(17.5f, 18.5f)
        moveTo(17.5f, 18.5f)
        lineTo(21f, 15f)
        moveTo(17.5f, 18.5f)
        lineTo(14f, 15f)
        moveTo(17.5f, 18.5f)
        lineTo(21f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 22f)
        curveTo(9.38582f, 22f, 8.06885f, 21.966f, 6.62588f, 21.9009f)
        curveTo(4.91103f, 21.8235f, 3.50186f, 20.515f, 3.27279f, 18.8447f)
        curveTo(3.1233f, 17.7547f, 3f, 16.6376f, 3f, 15.5f)
        curveTo(3f, 14.3624f, 3.1233f, 13.2453f, 3.27279f, 12.1553f)
        curveTo(3.50186f, 10.485f, 4.91103f, 9.17649f, 6.62588f, 9.09909f)
        curveTo(8.06885f, 9.03397f, 9.53465f, 9f, 11.1488f, 9f)
        curveTo(12.763f, 9f, 14.2288f, 9.03397f, 15.6718f, 9.09909f)
        curveTo(17.3331f, 9.17407f, 18.7076f, 10.4046f, 19f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 9f)
        verticalLineTo(6.5f)
        curveTo(6.5f, 4.01472f, 8.51472f, 2f, 11f, 2f)
        curveTo(13.4853f, 2f, 15.5f, 4.01472f, 15.5f, 6.5f)
        verticalLineTo(9f)
        }
        }.build()

        return _squareLockRemove01!!
    }

private var _squareLockRemove01: ImageVector? = null
