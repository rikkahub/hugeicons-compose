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

val HugeIcons.UserWarning03: ImageVector
    get() {
        if (_userWarning03 != null) {
            return _userWarning03!!
        }
        _userWarning03 = ImageVector.Builder(
            name = "UserWarning03",
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
            moveTo(20f, 21f)
            curveTo(20f, 18.7328f, 20f, 17.5992f, 19.5929f, 16.7097f)
            curveTo(19.1649f, 15.7746f, 18.4287f, 15.0144f, 17.5071f, 14.5558f)
            curveTo(16.6305f, 14.1196f, 15.5f, 14f, 13.2263f, 14.0051f)
            lineTo(10.7728f, 14f)
            curveTo(8.5f, 14f, 7.39496f, 14.1069f, 6.52924f, 14.528f)
            curveTo(5.57859f, 14.9904f, 4.82688f, 15.7651f, 4.39412f, 16.7284f)
            curveTo(4.00001f, 17.6057f, 4.00001f, 18.7371f, 4f, 21f)
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
            moveTo(16f, 7f)
            curveTo(16f, 9.20914f, 14.2091f, 11f, 12f, 11f)
            curveTo(9.79086f, 11f, 8f, 9.20914f, 8f, 7f)
            curveTo(8f, 4.79086f, 9.79086f, 3f, 12f, 3f)
            curveTo(14.2091f, 3f, 16f, 4.79086f, 16f, 7f)
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
            moveTo(20f, 5f)
            verticalLineTo(9f)
            moveTo(20f, 12f)
            verticalLineTo(12.01f)
        }
        }.build()

        return _userWarning03!!
    }

private var _userWarning03: ImageVector? = null
