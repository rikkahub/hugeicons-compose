package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mic01: ImageVector
    get() {
        if (_mic01 != null) {
            return _mic01!!
        }
        _mic01 = ImageVector.Builder(
            name = "Mic01",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(7f, 6.5f)
            curveTo(7f, 4.01472f, 9.01472f, 2f, 11.5f, 2f)
            curveTo(13.9853f, 2f, 16f, 4.01472f, 16f, 6.5f)
            verticalLineTo(11.5f)
            curveTo(16f, 13.9853f, 13.9853f, 16f, 11.5f, 16f)
            curveTo(9.01472f, 16f, 7f, 13.9853f, 7f, 11.5f)
            verticalLineTo(6.5f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(11.5f, 19f)
            horizontalLineTo(11.0828f)
            curveTo(7.57267f, 19f, 4.57706f, 16.4623f, 4f, 13f)
            moveTo(11.5f, 19f)
            horizontalLineTo(11.9172f)
            curveTo(15.4273f, 19f, 18.4229f, 16.4623f, 19f, 13f)
            moveTo(11.5f, 19f)
            verticalLineTo(22f)
        }
        }.build()

        return _mic01!!
    }

private var _mic01: ImageVector? = null
