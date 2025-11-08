package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareLockCheck01: ImageVector
    get() {
        if (_squareLockCheck01 != null) {
            return _squareLockCheck01!!
        }
        _squareLockCheck01 = ImageVector.Builder(
            name = "SquareLockCheck01",
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
        moveTo(14f, 20f)
        curveTo(14f, 20f, 15f, 20f, 16f, 22f)
        curveTo(16f, 22f, 19.1765f, 17f, 22f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 14f)
        curveTo(17.9505f, 13.3775f, 17.8765f, 12.7622f, 17.7944f, 12.1553f)
        curveTo(17.5686f, 10.485f, 16.1797f, 9.17649f, 14.4896f, 9.09909f)
        curveTo(13.0673f, 9.03397f, 11.6226f, 9f, 10.0316f, 9f)
        curveTo(8.44068f, 9f, 6.99596f, 9.03397f, 5.57374f, 9.09909f)
        curveTo(3.88355f, 9.17649f, 2.49464f, 10.485f, 2.26887f, 12.1553f)
        curveTo(2.12152f, 13.2453f, 2f, 14.3624f, 2f, 15.5f)
        curveTo(2f, 16.6376f, 2.12152f, 17.7547f, 2.26887f, 18.8447f)
        curveTo(2.49464f, 20.515f, 3.88355f, 21.8235f, 5.57374f, 21.9009f)
        curveTo(6.99596f, 21.966f, 8.44068f, 22f, 10.0316f, 22f)
        curveTo(10.5344f, 22f, 11.0225f, 21.9966f, 11.5f, 21.9899f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 9f)
        verticalLineTo(6.5f)
        curveTo(5.5f, 4.01472f, 7.51472f, 2f, 10f, 2f)
        curveTo(12.4853f, 2f, 14.5f, 4.01472f, 14.5f, 6.5f)
        verticalLineTo(9f)
        }
        }.build()

        return _squareLockCheck01!!
    }

private var _squareLockCheck01: ImageVector? = null
