package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleLockRemove01: ImageVector
    get() {
        if (_circleLockRemove01 != null) {
            return _circleLockRemove01!!
        }
        _circleLockRemove01 = ImageVector.Builder(
            name = "CircleLockRemove01",
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
        moveTo(10.5f, 22f)
        curveTo(6.55227f, 22f, 3.5f, 18.866f, 3.5f, 15f)
        curveTo(3.5f, 11.134f, 6.70027f, 8f, 10.648f, 8f)
        curveTo(13.4128f, 8f, 15.811f, 9.53725f, 17f, 11.7866f)
        }

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
        moveTo(13.5f, 22f)
        lineTo(17f, 18.5f)
        moveTo(17f, 18.5f)
        lineTo(20.5f, 15f)
        moveTo(17f, 18.5f)
        lineTo(13.5f, 15f)
        moveTo(17f, 18.5f)
        lineTo(20.5f, 22f)
        }
        }.build()

        return _circleLockRemove01!!
    }

private var _circleLockRemove01: ImageVector? = null
