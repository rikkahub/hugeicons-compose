package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WindowsOld: ImageVector
    get() {
        if (_windowsOld != null) {
            return _windowsOld!!
        }
        _windowsOld = ImageVector.Builder(
            name = "WindowsOld",
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
        moveTo(14.0136f, 3.99538f)
        lineTo(8.01361f, 4.99036f)
        curveTo(5.61912f, 5.38744f, 4.42188f, 5.58597f, 3.71094f, 6.421f)
        curveTo(3f, 7.25602f, 3f, 8.46368f, 3f, 10.879f)
        lineTo(3f, 13.121f)
        curveTo(3f, 15.5363f, 3f, 16.744f, 3.71094f, 17.579f)
        curveTo(4.42188f, 18.414f, 5.61913f, 18.6126f, 8.01361f, 19.0096f)
        lineTo(14.0136f, 20.0046f)
        curveTo(17.2567f, 20.5424f, 18.8782f, 20.8113f, 19.9391f, 19.9171f)
        curveTo(21f, 19.023f, 21f, 17.3873f, 21f, 14.116f)
        verticalLineTo(9.88402f)
        curveTo(21f, 6.6127f, 21f, 4.97704f, 19.9391f, 4.08286f)
        curveTo(18.8782f, 3.18868f, 17.2567f, 3.45758f, 14.0136f, 3.99538f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 4.5f)
        verticalLineTo(19.5f)
        moveTo(3f, 12f)
        horizontalLineTo(21f)
        }
        }.build()

        return _windowsOld!!
    }

private var _windowsOld: ImageVector? = null
