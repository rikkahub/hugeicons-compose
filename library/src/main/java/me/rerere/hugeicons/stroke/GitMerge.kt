package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GitMerge: ImageVector
    get() {
        if (_gitMerge != null) {
            return _gitMerge!!
        }
        _gitMerge = ImageVector.Builder(
            name = "GitMerge",
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
        moveTo(7f, 20f)
        curveTo(8.10457f, 20f, 9f, 19.1046f, 9f, 18f)
        curveTo(9f, 16.8954f, 8.10457f, 16f, 7f, 16f)
        curveTo(5.89543f, 16f, 5f, 16.8954f, 5f, 18f)
        curveTo(5f, 19.1046f, 5.89543f, 20f, 7f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 8f)
        curveTo(8.10457f, 8f, 9f, 7.10457f, 9f, 6f)
        curveTo(9f, 4.89543f, 8.10457f, 4f, 7f, 4f)
        curveTo(5.89543f, 4f, 5f, 4.89543f, 5f, 6f)
        curveTo(5f, 7.10457f, 5.89543f, 8f, 7f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 14f)
        curveTo(18.1046f, 14f, 19f, 13.1046f, 19f, 12f)
        curveTo(19f, 10.8954f, 18.1046f, 10f, 17f, 10f)
        curveTo(15.8954f, 10f, 15f, 10.8954f, 15f, 12f)
        curveTo(15f, 13.1046f, 15.8954f, 14f, 17f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.02116f, 8.2793f)
        verticalLineTo(15.4073f)
        moveTo(14.4113f, 12.0047f)
        lineTo(10.0193f, 12.0048f)
        curveTo(8.92158f, 12.0048f, 6.86182f, 11.1254f, 7.01818f, 8.78001f)
        }
        }.build()

        return _gitMerge!!
    }

private var _gitMerge: ImageVector? = null
