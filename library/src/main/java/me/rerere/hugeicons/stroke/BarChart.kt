package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BarChart: ImageVector
    get() {
        if (_barChart != null) {
            return _barChart!!
        }
        _barChart = ImageVector.Builder(
            name = "BarChart",
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
        moveTo(14f, 18f)
        verticalLineTo(6f)
        curveTo(14f, 5.53501f, 14f, 5.30252f, 13.9489f, 5.11177f)
        curveTo(13.8102f, 4.59413f, 13.4059f, 4.18981f, 12.8882f, 4.05111f)
        curveTo(12.6975f, 4f, 12.465f, 4f, 12f, 4f)
        curveTo(11.535f, 4f, 11.3025f, 4f, 11.1118f, 4.05111f)
        curveTo(10.5941f, 4.18981f, 10.1898f, 4.59413f, 10.0511f, 5.11177f)
        curveTo(10f, 5.30252f, 10f, 5.53501f, 10f, 6f)
        verticalLineTo(18f)
        curveTo(10f, 18.465f, 10f, 18.6975f, 10.0511f, 18.8882f)
        curveTo(10.1898f, 19.4059f, 10.5941f, 19.8102f, 11.1118f, 19.9489f)
        curveTo(11.3025f, 20f, 11.535f, 20f, 12f, 20f)
        curveTo(12.465f, 20f, 12.6975f, 20f, 12.8882f, 19.9489f)
        curveTo(13.4059f, 19.8102f, 13.8102f, 19.4059f, 13.9489f, 18.8882f)
        curveTo(14f, 18.6975f, 14f, 18.465f, 14f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 8f)
        verticalLineTo(6f)
        curveTo(21f, 5.53501f, 21f, 5.30252f, 20.9489f, 5.11177f)
        curveTo(20.8102f, 4.59413f, 20.4059f, 4.18981f, 19.8882f, 4.05111f)
        curveTo(19.6975f, 4f, 19.465f, 4f, 19f, 4f)
        curveTo(18.535f, 4f, 18.3025f, 4f, 18.1118f, 4.05111f)
        curveTo(17.5941f, 4.18981f, 17.1898f, 4.59413f, 17.0511f, 5.11177f)
        curveTo(17f, 5.30252f, 17f, 5.53501f, 17f, 6f)
        verticalLineTo(8f)
        curveTo(17f, 8.46499f, 17f, 8.69748f, 17.0511f, 8.88823f)
        curveTo(17.1898f, 9.40587f, 17.5941f, 9.81019f, 18.1118f, 9.94889f)
        curveTo(18.3025f, 10f, 18.535f, 10f, 19f, 10f)
        curveTo(19.465f, 10f, 19.6975f, 10f, 19.8882f, 9.94889f)
        curveTo(20.4059f, 9.81019f, 20.8102f, 9.40587f, 20.9489f, 8.88823f)
        curveTo(21f, 8.69748f, 21f, 8.46499f, 21f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 12f)
        verticalLineTo(6f)
        curveTo(7f, 5.53501f, 7f, 5.30252f, 6.94889f, 5.11177f)
        curveTo(6.81019f, 4.59413f, 6.40587f, 4.18981f, 5.88823f, 4.05111f)
        curveTo(5.69748f, 4f, 5.46499f, 4f, 5f, 4f)
        curveTo(4.53501f, 4f, 4.30252f, 4f, 4.11177f, 4.05111f)
        curveTo(3.59413f, 4.18981f, 3.18981f, 4.59413f, 3.05111f, 5.11177f)
        curveTo(3f, 5.30252f, 3f, 5.53501f, 3f, 6f)
        verticalLineTo(12f)
        curveTo(3f, 12.465f, 3f, 12.6975f, 3.05111f, 12.8882f)
        curveTo(3.18981f, 13.4059f, 3.59413f, 13.8102f, 4.11177f, 13.9489f)
        curveTo(4.30252f, 14f, 4.53501f, 14f, 5f, 14f)
        curveTo(5.46499f, 14f, 5.69748f, 14f, 5.88823f, 13.9489f)
        curveTo(6.40587f, 13.8102f, 6.81019f, 13.4059f, 6.94889f, 12.8882f)
        curveTo(7f, 12.6975f, 7f, 12.465f, 7f, 12f)
        }
        }.build()

        return _barChart!!
    }

private var _barChart: ImageVector? = null
