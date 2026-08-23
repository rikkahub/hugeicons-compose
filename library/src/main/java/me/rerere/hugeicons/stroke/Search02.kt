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

val HugeIcons.Search02: ImageVector
    get() {
        if (_search02 != null) {
            return _search02!!
        }
        _search02 = ImageVector.Builder(
            name = "Search02",
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
            moveTo(17f, 10f)
            curveTo(17f, 13.866f, 13.866f, 17f, 10f, 17f)
            curveTo(6.13401f, 17f, 3f, 13.866f, 3f, 10f)
            curveTo(3f, 6.13401f, 6.13401f, 3f, 10f, 3f)
            curveTo(13.866f, 3f, 17f, 6.13401f, 17f, 10f)
            close()
        }

        path(
            fill = SolidColor(Color(0xFF141B34)),
            stroke = null,
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(20.4697f, 21.5303f)
            curveTo(20.7626f, 21.8232f, 21.2374f, 21.8232f, 21.5303f, 21.5303f)
            curveTo(21.8232f, 21.2374f, 21.8232f, 20.7626f, 21.5303f, 20.4697f)
            lineTo(21f, 21f)
            lineTo(20.4697f, 21.5303f)
            close()
            moveTo(15f, 15f)
            lineTo(14.4697f, 15.5303f)
            lineTo(20.4697f, 21.5303f)
            lineTo(21f, 21f)
            lineTo(21.5303f, 20.4697f)
            lineTo(15.5303f, 14.4697f)
            lineTo(15f, 15f)
            close()
        }
        }.build()

        return _search02!!
    }

private var _search02: ImageVector? = null
