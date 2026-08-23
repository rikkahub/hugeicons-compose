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

val HugeIcons.Vynil01: ImageVector
    get() {
        if (_vynil01 != null) {
            return _vynil01!!
        }
        _vynil01 = ImageVector.Builder(
            name = "Vynil01",
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
            curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
            curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
            curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
            curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
            close()
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
            moveTo(9f, 6f)
            curveTo(7.62837f, 6.53566f, 6.53566f, 7.62837f, 6f, 9f)
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
            moveTo(14f, 12f)
            curveTo(14f, 10.8954f, 13.1046f, 10f, 12f, 10f)
            curveTo(10.8954f, 10f, 10f, 10.8954f, 10f, 12f)
            curveTo(10f, 13.1046f, 10.8954f, 14f, 12f, 14f)
            curveTo(13.1046f, 14f, 14f, 13.1046f, 14f, 12f)
            close()
        }
        }.build()

        return _vynil01!!
    }

private var _vynil01: ImageVector? = null
