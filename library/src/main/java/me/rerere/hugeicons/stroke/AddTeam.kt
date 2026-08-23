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

val HugeIcons.AddTeam: ImageVector
    get() {
        if (_addTeam != null) {
            return _addTeam!!
        }
        _addTeam = ImageVector.Builder(
            name = "AddTeam",
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
            moveTo(2.5f, 20f)
            curveTo(2.73089f, 17.0974f, 5.18124f, 14.6723f, 8.18816f, 14.5298f)
            curveTo(8.44209f, 14.5178f, 8.71121f, 14.5076f, 8.99999f, 14.5f)
            lineTo(9.80845f, 14.5521f)
            curveTo(11.2257f, 14.6435f, 12.51f, 15.1986f, 13.5f, 16.0632f)
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
            moveTo(12.25f, 8.75f)
            curveTo(12.25f, 10.5449f, 10.7949f, 12f, 9f, 12f)
            curveTo(7.20508f, 12f, 5.75f, 10.5449f, 5.75f, 8.75f)
            curveTo(5.75f, 6.95507f, 7.20508f, 5.5f, 9f, 5.5f)
            curveTo(10.7949f, 5.5f, 12.25f, 6.95507f, 12.25f, 8.75f)
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
            moveTo(15f, 10.9961f)
            curveTo(16.3442f, 11.1229f, 17.5564f, 11.6799f, 18.5f, 12.5197f)
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
            moveTo(15.4877f, 8f)
            curveTo(16.3965f, 7.42434f, 17.0001f, 6.40788f, 17.0001f, 5.25f)
            curveTo(17.0001f, 3.45507f, 15.5496f, 2f, 13.7602f, 2f)
            curveTo(12.8811f, 2f, 12.0838f, 2.35121f, 11.5001f, 2.92139f)
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
            moveTo(18.5f, 16f)
            verticalLineTo(22f)
            moveTo(21.5f, 19f)
            lineTo(15.5f, 19f)
        }
        }.build()

        return _addTeam!!
    }

private var _addTeam: ImageVector? = null
