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

val HugeIcons.Vegan: ImageVector
    get() {
        if (_vegan != null) {
            return _vegan!!
        }
        _vegan = ImageVector.Builder(
            name = "Vegan",
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
            moveTo(3.5f, 6f)
            curveTo(5.83333f, 7.875f, 10.5f, 13.5f, 10.5f, 21f)
            curveTo(10.5f, 14.4635f, 14.0446f, 9.35119f, 16.5f, 6.9043f)
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
            moveTo(14.437f, 9.06301f)
            curveTo(13.1877f, 7.8137f, 13.1877f, 5.78815f, 14.437f, 4.53884f)
            curveTo(16.3221f, 2.65376f, 20.4692f, 3.03078f, 20.4692f, 3.03078f)
            curveTo(20.4692f, 3.03078f, 20.8462f, 7.17794f, 18.9612f, 9.06301f)
            curveTo(18.542f, 9.48222f, 18.0354f, 9.76076f, 17.5f, 9.89864f)
        }
        }.build()

        return _vegan!!
    }

private var _vegan: ImageVector? = null
