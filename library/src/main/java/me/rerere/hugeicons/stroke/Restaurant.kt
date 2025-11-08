package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Restaurant: ImageVector
    get() {
        if (_restaurant != null) {
            return _restaurant!!
        }
        _restaurant = ImageVector.Builder(
            name = "Restaurant",
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
        moveTo(3f, 12f)
        verticalLineTo(17f)
        moveTo(3f, 17f)
        horizontalLineTo(5f)
        curveTo(6.41421f, 17f, 7.12132f, 17f, 7.56066f, 17.4393f)
        curveTo(8f, 17.8787f, 8f, 18.5858f, 8f, 20f)
        verticalLineTo(21f)
        moveTo(3f, 17f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 7f)
        lineTo(9.31672f, 4.08345f)
        curveTo(10.6334f, 3.36115f, 11.2918f, 3f, 12f, 3f)
        curveTo(12.7082f, 3f, 13.3666f, 3.36115f, 14.6833f, 4.08345f)
        lineTo(20f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 6f)
        verticalLineTo(10f)
        moveTo(6f, 6f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 12f)
        verticalLineTo(17f)
        moveTo(21f, 17f)
        horizontalLineTo(19f)
        curveTo(17.5858f, 17f, 16.8787f, 17f, 16.4393f, 17.4393f)
        curveTo(16f, 17.8787f, 16f, 18.5858f, 16f, 20f)
        verticalLineTo(21f)
        moveTo(21f, 17f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 14f)
        horizontalLineTo(12f)
        moveTo(17f, 14f)
        horizontalLineTo(12f)
        moveTo(12f, 14f)
        verticalLineTo(21f)
        moveTo(12f, 21f)
        horizontalLineTo(11f)
        moveTo(12f, 21f)
        horizontalLineTo(13f)
        }
        }.build()

        return _restaurant!!
    }

private var _restaurant: ImageVector? = null
