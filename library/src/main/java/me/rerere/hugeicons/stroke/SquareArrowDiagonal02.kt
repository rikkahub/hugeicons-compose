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

val HugeIcons.SquareArrowDiagonal02: ImageVector
    get() {
        if (_squareArrowDiagonal02 != null) {
            return _squareArrowDiagonal02!!
        }
        _squareArrowDiagonal02 = ImageVector.Builder(
            name = "SquareArrowDiagonal02",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2.5f, 11.9999f)
            curveTo(2.5f, 7.52157f, 2.5f, 5.28239f, 3.89124f, 3.89115f)
            curveTo(5.28249f, 2.49991f, 7.52166f, 2.49991f, 12f, 2.49991f)
            curveTo(16.4783f, 2.49991f, 18.7175f, 2.49991f, 20.1088f, 3.89115f)
            curveTo(21.5f, 5.28239f, 21.5f, 7.52157f, 21.5f, 11.9999f)
            curveTo(21.5f, 16.4783f, 21.5f, 18.7174f, 20.1088f, 20.1087f)
            curveTo(18.7175f, 21.4999f, 16.4783f, 21.4999f, 12f, 21.4999f)
            curveTo(7.52166f, 21.4999f, 5.28249f, 21.4999f, 3.89124f, 20.1087f)
            curveTo(2.5f, 18.7174f, 2.5f, 16.4783f, 2.5f, 11.9999f)
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
            moveTo(15.8008f, 15.8009f)
            lineTo(8.19915f, 8.19919f)
            moveTo(15.8008f, 15.8009f)
            curveTo(16.2444f, 15.3573f, 15.8098f, 13.2652f, 15.8008f, 12.6335f)
            moveTo(15.8008f, 15.8009f)
            curveTo(15.3573f, 16.2445f, 13.2652f, 15.8099f, 12.6335f, 15.8009f)
            moveTo(8.19915f, 8.19919f)
            curveTo(8.64273f, 7.75561f, 10.7348f, 8.19021f, 11.3665f, 8.19919f)
            moveTo(8.19915f, 8.19919f)
            curveTo(7.75558f, 8.64276f, 8.19018f, 10.7348f, 8.19915f, 11.3666f)
        }
        }.build()

        return _squareArrowDiagonal02!!
    }

private var _squareArrowDiagonal02: ImageVector? = null
