package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Blueprint: ImageVector
    get() {
        if (_blueprint != null) {
            return _blueprint!!
        }
        _blueprint = ImageVector.Builder(
            name = "Blueprint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14f, 13f)
            verticalLineTo(15f)
            moveTo(14f, 15f)
            horizontalLineTo(15.5f)
            curveTo(16.4346f, 15f, 16.9019f, 15f, 17.25f, 14.799f)
            curveTo(17.478f, 14.6674f, 17.6674f, 14.478f, 17.799f, 14.25f)
            curveTo(18f, 13.9019f, 18f, 13.4346f, 18f, 12.5f)
            verticalLineTo(12f)
            curveTo(18f, 11.535f, 18f, 11.3025f, 17.9489f, 11.1118f)
            curveTo(17.8102f, 10.5941f, 17.4059f, 10.1898f, 16.8882f, 10.0511f)
            curveTo(16.6975f, 10f, 16.465f, 10f, 16f, 10f)
            moveTo(14f, 15f)
            curveTo(14f, 15.465f, 14f, 15.6975f, 13.9489f, 15.8882f)
            curveTo(13.8102f, 16.4059f, 13.4059f, 16.8102f, 12.8882f, 16.9489f)
            curveTo(12.6975f, 17f, 12.465f, 17f, 12f, 17f)
            curveTo(11.535f, 17f, 11.3025f, 17f, 11.1118f, 16.9489f)
            curveTo(10.5941f, 16.8102f, 10.1898f, 16.4059f, 10.0511f, 15.8882f)
            curveTo(10f, 15.6975f, 10f, 15.465f, 10f, 15f)
            verticalLineTo(12f)
            curveTo(10f, 11.535f, 10f, 11.3025f, 10.0511f, 11.1118f)
            curveTo(10.1898f, 10.5941f, 10.5941f, 10.1898f, 11.1118f, 10.0511f)
            curveTo(11.3025f, 10f, 11.535f, 10f, 12f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(6f, 6f)
            horizontalLineTo(17f)
            curveTo(19.357f, 6f, 20.5355f, 6f, 21.2678f, 6.73223f)
            curveTo(22f, 7.46447f, 22f, 8.64298f, 22f, 11f)
            verticalLineTo(16f)
            curveTo(22f, 18.357f, 22f, 19.5355f, 21.2678f, 20.2678f)
            curveTo(20.5355f, 21f, 19.357f, 21f, 17f, 21f)
            horizontalLineTo(4f)
            moveTo(4f, 21f)
            horizontalLineTo(6f)
            moveTo(4f, 21f)
            curveTo(2.89543f, 21f, 2f, 20.1046f, 2f, 19f)
            moveTo(2f, 19f)
            curveTo(2f, 17.8954f, 2.89543f, 17f, 4f, 17f)
            curveTo(4.46499f, 17f, 4.69748f, 17f, 4.88823f, 16.9489f)
            curveTo(5.40587f, 16.8102f, 5.81019f, 16.4059f, 5.94889f, 15.8882f)
            curveTo(6f, 15.6975f, 6f, 15.465f, 6f, 15f)
            verticalLineTo(5f)
            curveTo(6f, 4.53501f, 6f, 4.30252f, 5.94889f, 4.11177f)
            curveTo(5.81019f, 3.59413f, 5.40587f, 3.18981f, 4.88823f, 3.05111f)
            curveTo(4.69748f, 3f, 4.46499f, 3f, 4f, 3f)
            curveTo(2.89543f, 3f, 2f, 3.89543f, 2f, 5f)
            verticalLineTo(19f)
            close()
        }
        }.build()

        return _blueprint!!
    }

private var _blueprint: ImageVector? = null
