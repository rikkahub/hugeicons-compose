package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TimeZone: ImageVector
    get() {
        if (_timeZone != null) {
            return _timeZone!!
        }
        _timeZone = ImageVector.Builder(
            name = "TimeZone",
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
        moveTo(20f, 11f)
        curveTo(20f, 6.02944f, 15.9706f, 2f, 11f, 2f)
        curveTo(6.02944f, 2f, 2f, 6.02944f, 2f, 11f)
        curveTo(2f, 15.9706f, 6.02944f, 20f, 11f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 16.5f)
        verticalLineTo(18f)
        lineTo(19f, 18.5f)
        moveTo(22f, 18f)
        curveTo(22f, 20.2091f, 20.2091f, 22f, 18f, 22f)
        curveTo(15.7909f, 22f, 14f, 20.2091f, 14f, 18f)
        curveTo(14f, 15.7909f, 15.7909f, 14f, 18f, 14f)
        curveTo(20.2091f, 14f, 22f, 15.7909f, 22f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 8f)
        horizontalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 14f)
        lineTo(12f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 11f)
        curveTo(14f, 6.02944f, 12.6569f, 2f, 11f, 2f)
        curveTo(9.34315f, 2f, 8f, 6.02944f, 8f, 11f)
        curveTo(8f, 15.9706f, 9.34315f, 20f, 11f, 20f)
        }
        }.build()

        return _timeZone!!
    }

private var _timeZone: ImageVector? = null
