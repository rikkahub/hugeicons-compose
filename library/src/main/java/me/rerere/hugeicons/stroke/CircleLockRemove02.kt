package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleLockRemove02: ImageVector
    get() {
        if (_circleLockRemove02 != null) {
            return _circleLockRemove02!!
        }
        _circleLockRemove02 = ImageVector.Builder(
            name = "CircleLockRemove02",
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
        moveTo(15f, 9f)
        verticalLineTo(6.5f)
        curveTo(15f, 4.01472f, 12.9853f, 2f, 10.5f, 2f)
        curveTo(8.01472f, 2f, 6f, 4.01472f, 6f, 6.5f)
        verticalLineTo(9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.9635f, 21.9824f)
        curveTo(10.7992f, 21.9941f, 10.6333f, 22f, 10.466f, 22f)
        curveTo(6.61877f, 22f, 3.5f, 18.866f, 3.5f, 15f)
        curveTo(3.5f, 11.134f, 6.61877f, 8f, 10.466f, 8f)
        curveTo(12.8331f, 8f, 15f, 9f, 16f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 17f)
        lineTo(16.4989f, 18f)
        moveTo(16.4989f, 18f)
        lineTo(17.5f, 19f)
        moveTo(16.4989f, 18f)
        lineTo(17.5f, 17f)
        moveTo(16.4989f, 18f)
        lineTo(15.5f, 19f)
        moveTo(20.5f, 18f)
        curveTo(20.5f, 20.2091f, 18.7091f, 22f, 16.5f, 22f)
        curveTo(14.2909f, 22f, 12.5f, 20.2091f, 12.5f, 18f)
        curveTo(12.5f, 15.7909f, 14.2909f, 14f, 16.5f, 14f)
        curveTo(18.7091f, 14f, 20.5f, 15.7909f, 20.5f, 18f)
        }
        }.build()

        return _circleLockRemove02!!
    }

private var _circleLockRemove02: ImageVector? = null
