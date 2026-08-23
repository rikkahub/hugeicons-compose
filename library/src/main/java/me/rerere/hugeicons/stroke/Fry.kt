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

val HugeIcons.Fry: ImageVector
    get() {
        if (_fry != null) {
            return _fry!!
        }
        _fry = ImageVector.Builder(
            name = "Fry",
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
            moveTo(22f, 9.5f)
            curveTo(22f, 13.6421f, 18.6421f, 17f, 14.5f, 17f)
            curveTo(10.3579f, 17f, 7f, 13.6421f, 7f, 9.5f)
            curveTo(7f, 5.35786f, 10.3579f, 2f, 14.5f, 2f)
            curveTo(18.6421f, 2f, 22f, 5.35786f, 22f, 9.5f)
            close()
        }

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
            moveTo(19f, 9f)
            curveTo(19f, 11.2091f, 17.2091f, 13f, 15f, 13f)
            curveTo(12.7909f, 13f, 11f, 11.2091f, 11f, 9f)
            curveTo(11f, 6.79086f, 12.7909f, 5f, 15f, 5f)
            curveTo(17.2091f, 5f, 19f, 6.79086f, 19f, 9f)
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
            moveTo(2f, 22f)
            lineTo(9f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(15.125f, 9f)
            horizontalLineTo(15f)
            moveTo(15.25f, 9f)
            curveTo(15.25f, 9.13807f, 15.1381f, 9.25f, 15f, 9.25f)
            curveTo(14.8619f, 9.25f, 14.75f, 9.13807f, 14.75f, 9f)
            curveTo(14.75f, 8.86193f, 14.8619f, 8.75f, 15f, 8.75f)
            curveTo(15.1381f, 8.75f, 15.25f, 8.86193f, 15.25f, 9f)
            close()
        }
        }.build()

        return _fry!!
    }

private var _fry: ImageVector? = null
