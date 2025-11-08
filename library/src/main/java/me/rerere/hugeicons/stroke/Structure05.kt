package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Structure05: ImageVector
    get() {
        if (_structure05 != null) {
            return _structure05!!
        }
        _structure05 = ImageVector.Builder(
            name = "Structure05",
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
        moveTo(2f, 5f)
        curveTo(2f, 2.518f, 2.518f, 2f, 5f, 2f)
        horizontalLineTo(7f)
        curveTo(9.482f, 2f, 10f, 2.518f, 10f, 5f)
        curveTo(10f, 7.482f, 9.482f, 8f, 7f, 8f)
        horizontalLineTo(5f)
        curveTo(2.518f, 8f, 2f, 7.482f, 2f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 9f)
        curveTo(15f, 6.518f, 15.4532f, 6f, 17.625f, 6f)
        horizontalLineTo(19.375f)
        curveTo(21.5468f, 6f, 22f, 6.518f, 22f, 9f)
        curveTo(22f, 11.482f, 21.5468f, 12f, 19.375f, 12f)
        horizontalLineTo(17.625f)
        curveTo(15.4532f, 12f, 15f, 11.482f, 15f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 19f)
        curveTo(13f, 16.518f, 13.518f, 16f, 16f, 16f)
        horizontalLineTo(18f)
        curveTo(20.482f, 16f, 21f, 16.518f, 21f, 19f)
        curveTo(21f, 21.482f, 20.482f, 22f, 18f, 22f)
        horizontalLineTo(16f)
        curveTo(13.518f, 22f, 13f, 21.482f, 13f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 7f)
        lineTo(10f, 5f)
        lineTo(13.5714f, 16f)
        }
        }.build()

        return _structure05!!
    }

private var _structure05: ImageVector? = null
