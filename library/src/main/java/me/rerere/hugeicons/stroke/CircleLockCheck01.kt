package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleLockCheck01: ImageVector
    get() {
        if (_circleLockCheck01 != null) {
            return _circleLockCheck01!!
        }
        _circleLockCheck01 = ImageVector.Builder(
            name = "CircleLockCheck01",
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
        moveTo(13f, 18f)
        curveTo(13f, 18f, 14f, 18f, 15f, 20f)
        curveTo(15f, 20f, 18.1765f, 15f, 21f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 12f)
        curveTo(14.9041f, 9.63505f, 12.5526f, 8f, 9.82857f, 8f)
        curveTo(6.05725f, 8f, 3f, 11.134f, 3f, 15f)
        curveTo(3f, 18.866f, 6.05725f, 22f, 9.82857f, 22f)
        curveTo(10.1598f, 22f, 10.4855f, 21.9758f, 10.8041f, 21.9291f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 9.5f)
        verticalLineTo(6.5f)
        curveTo(14.5f, 4.01472f, 12.4853f, 2f, 10f, 2f)
        curveTo(7.51472f, 2f, 5.5f, 4.01472f, 5.5f, 6.5f)
        verticalLineTo(9.5f)
        }
        }.build()

        return _circleLockCheck01!!
    }

private var _circleLockCheck01: ImageVector? = null
