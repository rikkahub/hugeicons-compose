package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Add02: ImageVector
    get() {
        if (_add02 != null) {
            return _add02!!
        }
        _add02 = ImageVector.Builder(
            name = "Add02",
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
        moveTo(12.001f, 20.0088f)
        curveTo(12.8289f, 20.0088f, 13.5f, 19.3377f, 13.5f, 18.5098f)
        verticalLineTo(13.5068f)
        horizontalLineTo(18.502f)
        curveTo(19.3295f, 13.5068f, 20.0004f, 12.8363f, 20.001f, 12.0088f)
        curveTo(20.0015f, 11.1805f, 19.3302f, 10.5088f, 18.502f, 10.5088f)
        horizontalLineTo(13.5f)
        verticalLineTo(5.50684f)
        curveTo(13.5f, 4.67933f, 12.8295f, 4.00835f, 12.002f, 4.00781f)
        curveTo(11.1737f, 4.00727f, 10.502f, 4.67857f, 10.502f, 5.50684f)
        verticalLineTo(10.5088f)
        horizontalLineTo(5.49902f)
        curveTo(4.67114f, 10.5088f, 4f, 11.1799f, 4f, 12.0078f)
        curveTo(4f, 12.8357f, 4.67114f, 13.5068f, 5.49902f, 13.5068f)
        horizontalLineTo(10.502f)
        verticalLineTo(18.5098f)
        curveTo(10.502f, 19.3377f, 11.1731f, 20.0088f, 12.001f, 20.0088f)
        }
        }.build()

        return _add02!!
    }

private var _add02: ImageVector? = null
