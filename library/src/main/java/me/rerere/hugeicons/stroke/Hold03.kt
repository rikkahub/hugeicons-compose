package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Hold03: ImageVector
    get() {
        if (_hold03 != null) {
            return _hold03!!
        }
        _hold03 = ImageVector.Builder(
            name = "Hold03",
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
        moveTo(20.5f, 9.5f)
        verticalLineTo(14.1667f)
        curveTo(20.5f, 16.34f, 20.5f, 17.4267f, 20.1689f, 18.2918f)
        curveTo(19.6627f, 19.6148f, 18.6207f, 20.6601f, 17.3019f, 21.1679f)
        curveTo(16.4395f, 21.5f, 15.3562f, 21.5f, 13.1896f, 21.5f)
        curveTo(12.0534f, 21.5f, 11.4853f, 21.5f, 10.9566f, 21.3834f)
        curveTo(10.1499f, 21.2056f, 9.40001f, 20.8294f, 8.77419f, 20.2888f)
        curveTo(8.36398f, 19.9344f, 8.02311f, 19.4785f, 7.34137f, 18.5667f)
        lineTo(4.33738f, 14.5487f)
        curveTo(3.8758f, 13.9314f, 3.88907f, 13.0789f, 4.36965f, 12.4763f)
        curveTo(4.99772f, 11.6888f, 6.16877f, 11.6237f, 6.8797f, 12.3369f)
        lineTo(8.5011f, 13.9634f)
        verticalLineTo(10.5f)
        verticalLineTo(6f)
        curveTo(8.5011f, 5.17157f, 9.17267f, 4.5f, 10.0011f, 4.5f)
        curveTo(10.8295f, 4.5f, 11.5011f, 5.17157f, 11.5011f, 6f)
        moveTo(11.5011f, 6f)
        verticalLineTo(4f)
        curveTo(11.5011f, 3.17157f, 12.1727f, 2.5f, 13.0011f, 2.5f)
        curveTo(13.8295f, 2.5f, 14.5011f, 3.17157f, 14.5011f, 4f)
        verticalLineTo(6f)
        moveTo(11.5011f, 6f)
        verticalLineTo(10.5f)
        moveTo(14.5011f, 6f)
        curveTo(14.5011f, 5.17157f, 15.1727f, 4.5f, 16.0011f, 4.5f)
        curveTo(16.8295f, 4.5f, 17.5011f, 5.17157f, 17.5011f, 6f)
        verticalLineTo(8f)
        moveTo(14.5011f, 6f)
        verticalLineTo(10.5f)
        moveTo(20.5011f, 10.5f)
        verticalLineTo(8f)
        curveTo(20.5011f, 7.17157f, 19.8295f, 6.5f, 19.0011f, 6.5f)
        curveTo(18.1727f, 6.5f, 17.5011f, 7.17157f, 17.5011f, 8f)
        moveTo(17.5011f, 8f)
        verticalLineTo(10.5f)
        }
        }.build()

        return _hold03!!
    }

private var _hold03: ImageVector? = null
