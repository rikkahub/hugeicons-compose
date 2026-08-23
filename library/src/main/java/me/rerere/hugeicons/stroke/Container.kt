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

val HugeIcons.Container: ImageVector
    get() {
        if (_container != null) {
            return _container!!
        }
        _container = ImageVector.Builder(
            name = "Container",
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
            moveTo(15f, 5f)
            horizontalLineTo(9f)
            curveTo(6.09433f, 5f, 4.64149f, 5f, 3.62036f, 5.73563f)
            curveTo(3.27976f, 5.981f, 2.981f, 6.27976f, 2.73563f, 6.62036f)
            curveTo(2f, 7.64149f, 2f, 9.09433f, 2f, 12f)
            curveTo(2f, 14.9057f, 2f, 16.3585f, 2.73563f, 17.3796f)
            curveTo(2.981f, 17.7202f, 3.27976f, 18.019f, 3.62036f, 18.2644f)
            curveTo(4.64149f, 19f, 6.09433f, 19f, 9f, 19f)
            horizontalLineTo(15f)
            curveTo(17.9057f, 19f, 19.3585f, 19f, 20.3796f, 18.2644f)
            curveTo(20.7202f, 18.019f, 21.019f, 17.7202f, 21.2644f, 17.3796f)
            curveTo(22f, 16.3585f, 22f, 14.9057f, 22f, 12f)
            curveTo(22f, 9.09433f, 22f, 7.64149f, 21.2644f, 6.62036f)
            curveTo(21.019f, 6.27976f, 20.7202f, 5.981f, 20.3796f, 5.73563f)
            curveTo(19.3585f, 5f, 17.9057f, 5f, 15f, 5f)
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
            moveTo(18f, 9f)
            verticalLineTo(15f)
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
            moveTo(14f, 9f)
            verticalLineTo(15f)
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
            moveTo(10f, 9f)
            verticalLineTo(15f)
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
            moveTo(6f, 9f)
            verticalLineTo(15f)
        }
        }.build()

        return _container!!
    }

private var _container: ImageVector? = null
