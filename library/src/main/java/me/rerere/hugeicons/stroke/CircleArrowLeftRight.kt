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

val HugeIcons.CircleArrowLeftRight: ImageVector
    get() {
        if (_circleArrowLeftRight != null) {
            return _circleArrowLeftRight!!
        }
        _circleArrowLeftRight = ImageVector.Builder(
            name = "CircleArrowLeftRight",
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
            moveTo(22f, 12f)
            arcTo(10f, 10f, 0f, true, false, 2f, 12f)
            arcTo(10f, 10f, 0f, true, false, 22f, 12f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.55f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8.5f, 9.3f)
            lineTo(15.5f, 9.3f)
            moveTo(8.5f, 9.3f)
            curveTo(8.5f, 8.59598f, 10.25f, 7.5f, 10.25f, 7.5f)
            moveTo(8.5f, 9.3f)
            curveTo(8.5f, 10.004f, 10.25f, 11.1f, 10.25f, 11.1f)
            moveTo(15.5f, 14.7f)
            horizontalLineTo(8.5f)
            moveTo(15.5f, 14.7f)
            curveTo(15.5f, 13.996f, 13.75f, 12.9f, 13.75f, 12.9f)
            moveTo(15.5f, 14.7f)
            curveTo(15.5f, 15.404f, 13.75f, 16.5f, 13.75f, 16.5f)
        }
        }.build()

        return _circleArrowLeftRight!!
    }

private var _circleArrowLeftRight: ImageVector? = null
