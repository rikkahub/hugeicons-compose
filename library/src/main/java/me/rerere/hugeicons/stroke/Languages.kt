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

val HugeIcons.Languages: ImageVector
    get() {
        if (_languages != null) {
            return _languages!!
        }
        _languages = ImageVector.Builder(
            name = "Languages",
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
            moveTo(3.49744f, 5f)
            horizontalLineTo(7.99744f)
            moveTo(7.99744f, 5f)
            horizontalLineTo(13.4974f)
            moveTo(7.99744f, 5f)
            verticalLineTo(3.5f)
            moveTo(4.99744f, 13.5f)
            curveTo(7.49744f, 11.5f, 10.4974f, 7.5f, 10.9974f, 5f)
            moveTo(6.49744f, 7.5f)
            curveTo(6.99744f, 9f, 8.99744f, 11.5f, 9.99744f, 12f)
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
            moveTo(4.99744f, 13.5f)
            curveTo(7.49744f, 11.5f, 10.4974f, 7.5f, 10.9974f, 5f)
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
            moveTo(11.4974f, 20.5005f)
            lineTo(14.1591f, 14.2898f)
            curveTo(14.9451f, 12.456f, 15.338f, 11.5391f, 15.9974f, 11.5391f)
            curveTo(16.6568f, 11.5391f, 17.0498f, 12.456f, 17.8357f, 14.2898f)
            lineTo(20.4974f, 20.5005f)
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
            moveTo(13.4974f, 16.5f)
            horizontalLineTo(18.4974f)
        }
        }.build()

        return _languages!!
    }

private var _languages: ImageVector? = null
