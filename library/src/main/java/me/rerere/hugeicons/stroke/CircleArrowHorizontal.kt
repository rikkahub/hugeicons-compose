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

val HugeIcons.CircleArrowHorizontal: ImageVector
    get() {
        if (_circleArrowHorizontal != null) {
            return _circleArrowHorizontal!!
        }
        _circleArrowHorizontal = ImageVector.Builder(
            name = "CircleArrowHorizontal",
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
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(17f, 12f)
            lineTo(7f, 12f)
            moveTo(17f, 12f)
            curveTo(17f, 11.4398f, 15.604f, 10.3932f, 15.25f, 10f)
            moveTo(17f, 12f)
            curveTo(17f, 12.5602f, 15.604f, 13.6068f, 15.25f, 14f)
            moveTo(7f, 12f)
            curveTo(7f, 11.4398f, 8.39601f, 10.3932f, 8.75f, 10f)
            moveTo(7f, 12f)
            curveTo(7f, 12.5602f, 8.39601f, 13.6068f, 8.75f, 14f)
        }
        }.build()

        return _circleArrowHorizontal!!
    }

private var _circleArrowHorizontal: ImageVector? = null
