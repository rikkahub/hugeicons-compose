package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Square01: ImageVector
    get() {
        if (_square01 != null) {
            return _square01!!
        }
        _square01 = ImageVector.Builder(
            name = "Square01",
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
        moveTo(2.71474f, 7.02474f)
        curveTo(4.70574f, 6.91997f, 5.95498f, 7.07715f, 6.73577f, 8.91069f)
        curveTo(7.55559f, 11.111f, 9.58562f, 17.2403f, 10.0931f, 18.6548f)
        curveTo(10.6397f, 20.174f, 11.3424f, 21.2218f, 14.2313f, 20.9598f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.9999f, 7.0073f)
        curveTo(12.137f, 6.98235f, 9.7947f, 11.7222f, 8.49339f, 13.9923f)
        curveTo(7.06196f, 16.6117f, 4.6025f, 21.1519f, 1.9999f, 20.9773f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22.0001f, 8.99985f)
        horizontalLineTo(18.0001f)
        lineTo(21.2002f, 6.59981f)
        curveTo(21.7038f, 6.22212f, 22.0001f, 5.62938f, 22.0001f, 4.9999f)
        curveTo(22.0001f, 3.89538f, 21.1046f, 2.99999f, 20f, 3f)
        curveTo(18.8955f, 3.00001f, 17.9999f, 3.89543f, 17.9999f, 4.99998f)
        }
        }.build()

        return _square01!!
    }

private var _square01: ImageVector? = null
