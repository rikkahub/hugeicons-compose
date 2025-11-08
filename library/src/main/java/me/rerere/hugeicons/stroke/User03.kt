package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.User03: ImageVector
    get() {
        if (_user03 != null) {
            return _user03!!
        }
        _user03 = ImageVector.Builder(
            name = "User03",
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
        moveTo(16f, 7f)
        curveTo(16f, 9.20914f, 14.2091f, 11f, 12f, 11f)
        curveTo(9.79086f, 11f, 8f, 9.20914f, 8f, 7f)
        curveTo(8f, 4.79086f, 9.79086f, 3f, 12f, 3f)
        curveTo(14.2091f, 3f, 16f, 4.79086f, 16f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 14f)
        horizontalLineTo(10f)
        curveTo(7.23858f, 14f, 5f, 16.2386f, 5f, 19f)
        curveTo(5f, 20.1046f, 5.89543f, 21f, 7f, 21f)
        horizontalLineTo(17f)
        curveTo(18.1046f, 21f, 19f, 20.1046f, 19f, 19f)
        curveTo(19f, 16.2386f, 16.7614f, 14f, 14f, 14f)
        }
        }.build()

        return _user03!!
    }

private var _user03: ImageVector? = null
