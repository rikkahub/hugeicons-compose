package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SpoonAndKnife: ImageVector
    get() {
        if (_spoonAndKnife != null) {
            return _spoonAndKnife!!
        }
        _spoonAndKnife = ImageVector.Builder(
            name = "SpoonAndKnife",
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
        moveTo(6.5f, 17.3306f)
        curveTo(7.78183f, 18.9563f, 9.76903f, 20f, 12f, 20f)
        curveTo(13.9587f, 20f, 15.7295f, 19.1955f, 17f, 17.8989f)
        moveTo(8.5f, 6.93647f)
        curveTo(9.52961f, 6.34088f, 10.725f, 6f, 12f, 6f)
        curveTo(13.9587f, 6f, 15.7295f, 6.80446f, 17f, 8.10101f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 13f)
        curveTo(16f, 15.2091f, 14.2091f, 17f, 12f, 17f)
        curveTo(9.79085f, 17f, 8f, 15.2091f, 8f, 13f)
        curveTo(8f, 10.7909f, 9.79085f, 9f, 12f, 9f)
        curveTo(14.2091f, 9f, 16f, 10.7909f, 16f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 7f)
        curveTo(6f, 8.38067f, 5.10457f, 9f, 4f, 9f)
        curveTo(2.89543f, 9f, 2f, 8.38067f, 2f, 7f)
        curveTo(2f, 5.61928f, 2.89543f, 4f, 4f, 4f)
        curveTo(5.10457f, 4f, 6f, 5.61928f, 6f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 13f)
        verticalLineTo(4f)
        horizontalLineTo(20f)
        curveTo(21.1046f, 4f, 22f, 4.89543f, 22f, 6f)
        verticalLineTo(13f)
        horizontalLineTo(19.5f)
        moveTo(19.5f, 13f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 9f)
        verticalLineTo(20f)
        }
        }.build()

        return _spoonAndKnife!!
    }

private var _spoonAndKnife: ImageVector? = null
