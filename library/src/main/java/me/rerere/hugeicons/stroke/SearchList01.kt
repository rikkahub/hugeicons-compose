package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SearchList01: ImageVector
    get() {
        if (_searchList01 != null) {
            return _searchList01!!
        }
        _searchList01 = ImageVector.Builder(
            name = "SearchList01",
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
        moveTo(2.5f, 9f)
        horizontalLineTo(6.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 14f)
        horizontalLineTo(6.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 4f)
        horizontalLineTo(18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5355f, 17.0355f)
        lineTo(21.5f, 20f)
        moveTo(20f, 13.5f)
        curveTo(20f, 10.7386f, 17.7614f, 8.5f, 15f, 8.5f)
        curveTo(12.2386f, 8.5f, 10f, 10.7386f, 10f, 13.5f)
        curveTo(10f, 16.2614f, 12.2386f, 18.5f, 15f, 18.5f)
        curveTo(17.7614f, 18.5f, 20f, 16.2614f, 20f, 13.5f)
        }
        }.build()

        return _searchList01!!
    }

private var _searchList01: ImageVector? = null
