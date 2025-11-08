package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleLock01: ImageVector
    get() {
        if (_circleLock01 != null) {
            return _circleLock01!!
        }
        _circleLock01 = ImageVector.Builder(
            name = "CircleLock01",
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
        moveTo(5f, 15f)
        curveTo(5f, 11.134f, 8.13401f, 8f, 12f, 8f)
        curveTo(15.866f, 8f, 19f, 11.134f, 19f, 15f)
        curveTo(19f, 18.866f, 15.866f, 22f, 12f, 22f)
        curveTo(8.13401f, 22f, 5f, 18.866f, 5f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 9.5f)
        verticalLineTo(6.5f)
        curveTo(16.5f, 4.01472f, 14.4853f, 2f, 12f, 2f)
        curveTo(9.51472f, 2f, 7.5f, 4.01472f, 7.5f, 6.5f)
        verticalLineTo(9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 15f)
        horizontalLineTo(12.009f)
        }
        }.build()

        return _circleLock01!!
    }

private var _circleLock01: ImageVector? = null
