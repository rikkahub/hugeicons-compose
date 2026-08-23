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

val HugeIcons.Mic02: ImageVector
    get() {
        if (_mic02 != null) {
            return _mic02!!
        }
        _mic02 = ImageVector.Builder(
            name = "Mic02",
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
            moveTo(12f, 18f)
            verticalLineTo(22f)
            moveTo(12f, 18f)
            horizontalLineTo(11.5208f)
            curveTo(8.11765f, 18f, 5.28262f, 15.3914f, 5f, 12f)
            moveTo(12f, 18f)
            horizontalLineTo(12.4792f)
            curveTo(15.8824f, 18f, 18.7174f, 15.3914f, 19f, 12f)
            moveTo(12f, 22f)
            horizontalLineTo(15f)
            moveTo(12f, 22f)
            horizontalLineTo(9f)
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
            moveTo(8f, 6f)
            curveTo(8f, 3.79086f, 9.79086f, 2f, 12f, 2f)
            curveTo(14.2091f, 2f, 16f, 3.79086f, 16f, 6f)
            verticalLineTo(11f)
            curveTo(16f, 13.2091f, 14.2091f, 15f, 12f, 15f)
            curveTo(9.79086f, 15f, 8f, 13.2091f, 8f, 11f)
            verticalLineTo(6f)
            close()
        }
        }.build()

        return _mic02!!
    }

private var _mic02: ImageVector? = null
