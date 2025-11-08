package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareLockAdd01: ImageVector
    get() {
        if (_squareLockAdd01 != null) {
            return _squareLockAdd01!!
        }
        _squareLockAdd01 = ImageVector.Builder(
            name = "SquareLockAdd01",
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
        moveTo(11.0658f, 22f)
        curveTo(9.43835f, 22f, 8.11054f, 21.966f, 6.6557f, 21.9009f)
        curveTo(4.92675f, 21.8235f, 3.50598f, 20.515f, 3.27504f, 18.8447f)
        curveTo(3.12431f, 17.7547f, 3f, 16.6376f, 3f, 15.5f)
        curveTo(3f, 14.3624f, 3.12431f, 13.2453f, 3.27504f, 12.1553f)
        curveTo(3.50598f, 10.485f, 4.92675f, 9.17649f, 6.6557f, 9.09909f)
        curveTo(8.11054f, 9.03397f, 9.5884f, 9f, 11.2159f, 9f)
        curveTo(12.8433f, 9f, 14.3212f, 9.03397f, 15.776f, 9.09909f)
        curveTo(17.2713f, 9.16603f, 18.536f, 10.1538f, 19f, 11.5f)
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

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 22f)
        lineTo(17f, 14f)
        moveTo(13f, 18f)
        horizontalLineTo(21f)
        }
        }.build()

        return _squareLockAdd01!!
    }

private var _squareLockAdd01: ImageVector? = null
