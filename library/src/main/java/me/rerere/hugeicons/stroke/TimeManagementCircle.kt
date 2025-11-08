package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TimeManagementCircle: ImageVector
    get() {
        if (_timeManagementCircle != null) {
            return _timeManagementCircle!!
        }
        _timeManagementCircle = ImageVector.Builder(
            name = "TimeManagementCircle",
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
        moveTo(7f, 19.5f)
        curveTo(7f, 20.8807f, 5.88071f, 22f, 4.5f, 22f)
        curveTo(3.11929f, 22f, 2f, 20.8807f, 2f, 19.5f)
        curveTo(2f, 18.1193f, 3.11929f, 17f, 4.5f, 17f)
        curveTo(5.88071f, 17f, 7f, 18.1193f, 7f, 19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 19.5f)
        curveTo(22f, 20.8807f, 20.8807f, 22f, 19.5f, 22f)
        curveTo(18.1193f, 22f, 17f, 20.8807f, 17f, 19.5f)
        curveTo(17f, 18.1193f, 18.1193f, 17f, 19.5f, 17f)
        curveTo(20.8807f, 17f, 22f, 18.1193f, 22f, 19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 17f)
        curveTo(19.3321f, 14.547f, 18.3951f, 14f, 15.227f, 14f)
        horizontalLineTo(8.77296f)
        curveTo(5.60493f, 14f, 4.66788f, 14.547f, 4.5f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 6.5f)
        lineTo(13f, 5f)
        moveTo(16.5f, 6.5f)
        curveTo(16.5f, 8.98528f, 14.4853f, 11f, 12f, 11f)
        curveTo(9.51472f, 11f, 7.5f, 8.98528f, 7.5f, 6.5f)
        curveTo(7.5f, 4.01472f, 9.51472f, 2f, 12f, 2f)
        curveTo(14.4853f, 2f, 16.5f, 4.01472f, 16.5f, 6.5f)
        }
        }.build()

        return _timeManagementCircle!!
    }

private var _timeManagementCircle: ImageVector? = null
