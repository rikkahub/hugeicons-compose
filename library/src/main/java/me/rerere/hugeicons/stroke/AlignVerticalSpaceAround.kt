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

val HugeIcons.AlignVerticalSpaceAround: ImageVector
    get() {
        if (_alignVerticalSpaceAround != null) {
            return _alignVerticalSpaceAround!!
        }
        _alignVerticalSpaceAround = ImageVector.Builder(
            name = "AlignVerticalSpaceAround",
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
            moveTo(14f, 9.5f)
            lineTo(10f, 9.5f)
            curveTo(8.89543f, 9.5f, 8f, 10.3954f, 8f, 11.5f)
            lineTo(8f, 12.5f)
            curveTo(8f, 13.6046f, 8.89543f, 14.5f, 10f, 14.5f)
            lineTo(14f, 14.5f)
            curveTo(15.1046f, 14.5f, 16f, 13.6046f, 16f, 12.5f)
            verticalLineTo(11.5f)
            curveTo(16f, 10.3954f, 15.1046f, 9.5f, 14f, 9.5f)
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
            moveTo(21f, 18.5f)
            lineTo(3f, 18.5f)
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
            moveTo(21f, 5.5f)
            lineTo(3f, 5.5f)
        }
        }.build()

        return _alignVerticalSpaceAround!!
    }

private var _alignVerticalSpaceAround: ImageVector? = null
