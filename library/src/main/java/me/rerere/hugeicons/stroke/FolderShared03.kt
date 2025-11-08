package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FolderShared03: ImageVector
    get() {
        if (_folderShared03 != null) {
            return _folderShared03!!
        }
        _folderShared03 = ImageVector.Builder(
            name = "FolderShared03",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.0064f, 18f)
        verticalLineTo(21.9846f)
        moveTo(20.5f, 22f)
        horizontalLineTo(3.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 5.5f)
        horizontalLineTo(12.0179f)
        moveTo(12.0179f, 5.5f)
        horizontalLineTo(16f)
        curveTo(18.8284f, 5.5f, 20.2426f, 5.5f, 21.1213f, 6.37868f)
        curveTo(22f, 7.25736f, 22f, 8.67157f, 22f, 11.5f)
        verticalLineTo(12f)
        curveTo(22f, 14.8284f, 22f, 16.2426f, 21.1213f, 17.1213f)
        curveTo(20.2426f, 18f, 18.8284f, 18f, 16f, 18f)
        horizontalLineTo(8f)
        curveTo(5.17157f, 18f, 3.75736f, 18f, 2.87868f, 17.1213f)
        curveTo(2f, 16.2426f, 2f, 14.8284f, 2f, 12f)
        verticalLineTo(6.95874f)
        curveTo(2f, 5.12858f, 2f, 4.2135f, 2.38587f, 3.52815f)
        curveTo(2.65503f, 3.05011f, 3.05011f, 2.65503f, 3.52815f, 2.38587f)
        curveTo(4.2135f, 2f, 5.12858f, 2f, 6.95874f, 2f)
        curveTo(7.93964f, 2f, 8.4301f, 2f, 8.87547f, 2.14228f)
        curveTo(9.18933f, 2.24254f, 9.48454f, 2.39383f, 9.74922f, 2.59006f)
        curveTo(10.1248f, 2.86851f, 10.4112f, 3.26664f, 10.9841f, 4.06291f)
        lineTo(12.0179f, 5.5f)
        }
        }.build()

        return _folderShared03!!
    }

private var _folderShared03: ImageVector? = null
