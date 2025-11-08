package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserTime03: ImageVector
    get() {
        if (_userTime03 != null) {
            return _userTime03!!
        }
        _userTime03 = ImageVector.Builder(
            name = "UserTime03",
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
        moveTo(14f, 6f)
        curveTo(14f, 8.20914f, 12.2091f, 10f, 10f, 10f)
        curveTo(7.79086f, 10f, 6f, 8.20914f, 6f, 6f)
        curveTo(6f, 3.79086f, 7.79086f, 2f, 10f, 2f)
        curveTo(12.2091f, 2f, 14f, 3.79086f, 14f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 19f)
        lineTo(17f, 18.4f)
        verticalLineTo(16f)
        moveTo(13f, 18f)
        curveTo(13f, 20.2091f, 14.7909f, 22f, 17f, 22f)
        curveTo(19.2091f, 22f, 21f, 20.2091f, 21f, 18f)
        curveTo(21f, 15.7909f, 19.2091f, 14f, 17f, 14f)
        curveTo(14.7909f, 14f, 13f, 15.7909f, 13f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 20f)
        horizontalLineTo(5f)
        curveTo(3.89543f, 20f, 3f, 19.1046f, 3f, 18f)
        curveTo(3f, 15.2386f, 5.23858f, 13f, 8f, 13f)
        horizontalLineTo(12.5f)
        }
        }.build()

        return _userTime03!!
    }

private var _userTime03: ImageVector? = null
